package classes;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private static String DB_NAME = "user_db";
    private static volatile UserRepository instance;

    private List<UserModel> listOfUsers=new ArrayList<UserModel>();

    public static UserRepository getInstance() {
        if (instance == null) {
            synchronized (UserRepository.class) {
                if (instance == null) {
                    instance = handleLocalFile();
                }
            }
        }
        return instance;
    }

    private static UserRepository emptyInstance() {
        return new UserRepository();
    }

    public void addUser(UserModel user) {
        listOfUsers.add(user);
        try {
            UserRepository.updateLocalFile(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<UserModel> getListOfUsers() {
        return listOfUsers;
    }

    public void removeUser(int id){
        for (int i=0; i < listOfUsers.size(); i++) {
            if(listOfUsers.get(i).id == id) {
                listOfUsers.remove(i);
                break;
            }
        }
        try {
            UserRepository.updateLocalFile(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(int id, UserModel user){
       removeUser(id);
       addUser(user);
    }

    private static UserRepository handleLocalFile() {
        if(!fileExists()) {
            try {
                updateLocalFile(UserRepository.emptyInstance());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            return loadLocalFile();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static boolean fileExists() {
        String filePathString = DB_NAME;
        File f = new File(filePathString);
        return f.exists() && !f.isDirectory();
    }

    private static UserRepository loadLocalFile() throws IOException {
        String contentsOfTxt = new BufferedReader(new FileReader(DB_NAME)).readLine();
        UserRepository userRepository = new Gson().fromJson(contentsOfTxt, UserRepository.class);
        return userRepository;
    }


    private static void updateLocalFile(UserRepository userRepository) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(DB_NAME));
        String json = new Gson().toJson(userRepository, UserRepository.class);
        writer.write(json);
        writer.close();
    }
}

/*
TODO: acomodar tamaño ventana a tamaño minimo necesario para que los componentes entren.
      clase de datos con 8 strings distintas, llamada UsuarioARegistrar
      metodo en clase de backend que reciba esa clase de datos, lo agrega a una lista local
      e inmediatamente despues lo guarda en disco
      metodo init en backend que lee el archivo de disco, lo serializa a un objeto backend
      y lo setea como singleton

 */