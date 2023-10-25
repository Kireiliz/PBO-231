public class Employee extends person{
    //atribut
    private String id_emp;

    public Employee(String nama, String alamat, String id_emp) {
        super(nama, alamat);
        this.id_emp = id_emp;
    }

    public String getId_emp() {
        return id_emp;
    }

    public void setId_emp(String id_emp) {
        this.id_emp = id_emp;
    }

    @Override
    public String getAlamat() {
        // TODO Auto-generated method stub
        return super.getAlamat();
    }

    @Override
    public String getNama() {
        // TODO Auto-generated method stub
        return super.getNama();
    }
    
    

}
