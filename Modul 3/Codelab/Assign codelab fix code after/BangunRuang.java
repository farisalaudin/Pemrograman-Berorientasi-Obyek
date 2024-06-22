public class BangunRuang {
    // menghapus constructor  BangunRuang
    private String name;

    public void inputNilai(){
        System.out.println("\n==== Input nilai ====");
    }

    //Mengubah variabel +nama menjadi + getName()
    public void luasPermukaan(){
        System.out.println("Menghitung luas permukaan bangun " + getName());
    }

    public void volume(){
        System.out.println("Menghitung volume bangun " + getName());
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        // mmerubah dari awalnya return your menjadi name
        return name;
    }
}
