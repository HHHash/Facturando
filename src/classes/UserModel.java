package classes;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;
import java.util.UUID;

public class UserModel {
    @SerializedName("id")
     int id;

    @SerializedName("nombre")
     String nombre;

    @SerializedName("apellido")
     String apellido;

    @SerializedName("nombreEmpresa")
     String nombreEmpresa;

    @SerializedName("telefono")
     String telefono;

    @SerializedName("cuil")
     String cuil;

    @SerializedName("mail")
     String mail;

    @SerializedName("ciudad")
     String ciudad;

    @SerializedName("direccion")
     String direccion;


    public UserModel(String nombre, String apellido, String nombreEmpresa, String telefono, String cuil, String mail, String ciudad, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreEmpresa = nombreEmpresa;
        this.telefono = telefono;
        this.cuil = cuil;
        this.mail = mail;
        this.ciudad = ciudad;
        this.direccion = direccion;

        this.id = hashCode();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserModel userModel = (UserModel) o;
        return nombre.equals(userModel.nombre) && apellido.equals(userModel.apellido) && nombreEmpresa.equals(userModel.nombreEmpresa) && telefono.equals(userModel.telefono) && cuil.equals(userModel.cuil) && mail.equals(userModel.mail) && ciudad.equals(userModel.ciudad) && direccion.equals(userModel.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, nombreEmpresa, telefono, cuil, mail, ciudad, direccion);
    }
}
