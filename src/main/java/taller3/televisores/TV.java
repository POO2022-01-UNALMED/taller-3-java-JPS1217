package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private int volumen = 1;
    boolean estado;
    private Control control;
    private static int numTV;

    public TV (Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }

    public void canalUp(){
        if (estado == true) {
            if (canal >= 1 && canal <= 119 ) {
                this.canal++;
            }else{
                return;
            }
        }else{
            return;
        }
    }

    public void canalDown(){
        if (estado == true) {
            if (canal >= 2 && canal <= 120 ) {
                this.canal--;
            }else{
                return;
            }
        }else{
            return;
        }
    }

    public void volumenUp(){
        if (estado == true) {
            if (volumen >= 1 && volumen <= 6 ) {
                this.volumen++;
            }else{
                return;
            }
        }else{
            return;
        }
    }

    public void volumenDown(){
        if (estado == true) {
            if (volumen >= 2 && volumen <= 7 ) {
                this.volumen--;
            }else{
                return;
            }
        }else{
            return;
        }
    }

    public void turnOn(){
        this.estado = true;
    }

    public void turnOff(){
        this.estado = false;
    }

    public static int getNumTV() {
        return numTV;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal >= 1 && canal <= 120 ) {
            this.canal = canal;
        }else{
            return;
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public boolean getEstado() {
        return estado;
    }
}
