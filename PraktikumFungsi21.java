public class PraktikumFungsi21 {
    public static void main(String[] args) {
        
        int[][] stockBunga = {
            {10, 5, 15, 7}, 
            {6, 11, 9, 12}, 
            {2, 10, 10, 5}, 
            {5, 7, 12, 9}, 
        };
        int[] penguranganStock = {1, 2, 0, 5};
        double[] harga = {75000, 50000, 60000, 10000};

        //pemanggilan fungsi pendapatan setiap cabang
        pendapatanCabang(stockBunga, harga);

        //pemanggilan fungsi pengurangan stok cabang "Royal Garden 4"
        stockBungaRoyalGarden4(stockBunga, penguranganStock);

    }
    
    public static void pendapatanCabang(int[][] stockBunga, double[] harga) {
        double[] pendapatan = new double[stockBunga.length];
    
        for (int i = 0; i < stockBunga.length; i++) {
            double total = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                total += stockBunga[i][j] * harga[j];
            }
            pendapatan[i] = total;
        }
    
        System.out.println("Pendapatan setiap cabang:");
        for (int i = 0; i < pendapatan.length; i++) {
            System.out.printf("Royal Garden %d: %.2f%n", i+1, pendapatan[i]);
        }
    }


    public static void stockBungaRoyalGarden4(int[][] stockBunga, int[] penguranganStock) {
        int[] Aglonema = stockBunga[3]; 
        int[] Keladi = stockBunga[3];
        int[] Alocasia = stockBunga[3];
        int[] Mawar = stockBunga[3];
    
        
        Aglonema[0] -= penguranganStock[0];
        Keladi[1] -= penguranganStock[1];
        Alocasia[2] -= penguranganStock[2];
        Mawar[3] -= penguranganStock[3];
    
        System.out.printf("Stock bunga pada cabang Royal Garden 4: %n");
        System.out.printf("Aglonema: %d%n", Aglonema[0]);
        System.out.printf("Keladi: %d%n", Keladi[1]);
        System.out.printf("Alocasia: %d%n", Alocasia[2]);
        System.out.printf("Mawar: %d%n", Mawar[3]);
    }
}
