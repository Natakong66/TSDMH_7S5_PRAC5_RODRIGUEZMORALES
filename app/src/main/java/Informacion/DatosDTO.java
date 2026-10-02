package Informacion;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class DatosDTO implements Parcelable {
    String nombre;
    int edad;
    String correo;

    public DatosDTO()  {
    }

    public DatosDTO(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    protected DatosDTO(Parcel in) {
        nombre = in.readString();
        edad = in.readInt();
        correo = in.readString();
    }

    public static final Creator<DatosDTO> CREATOR = new Creator<DatosDTO>() {
        @Override
        public DatosDTO createFromParcel(Parcel in) {
            return new DatosDTO(in);
        }

        @Override
        public DatosDTO[] newArray(int size) {
            return new DatosDTO[size];
        }
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeInt(edad);
        dest.writeString(correo);
    }
}