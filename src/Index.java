//NAMA  :Aldi Lesmana
//NIM   :10117108   
//KELAS :IF-3

/**
 *
 * @author Aldi Lesmana
 */
public class Index {
    private double quis,uts,uas;

    public double getQuis() {
        return quis;
    }

    public void setQuis(double quis) {
        this.quis = quis;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }
    
    public double nilaiAkhir(double nilaiAkhir){
        nilaiAkhir = (0.2*quis)+(0.3*uts)+(0.5*uas);
        
        if(nilaiAkhir >=80 && nilaiAkhir<=100){
            System.out.println("Index = 'A'");
            System.out.println("Keterangan = Sangat Baik");
        }else if(nilaiAkhir >=68 && nilaiAkhir<=80){
            System.out.println("Index = 'B'");
            System.out.println("Keterangan = Baik");
        }else if(nilaiAkhir >=56 && nilaiAkhir<=68){
            System.out.println("index = 'C'");
            System.out.println("Keterangan = Cukup");
        }else if(nilaiAkhir >=45 && nilaiAkhir<=56){
            System.out.println("Index = 'D'");
            System.out.println("Keterangan = kurang");
        }else{
            System.out.println("Index = 'E'");
            System.out.println("Keterangan = Sangat Kurang");
        }
        return nilaiAkhir;
}
}
