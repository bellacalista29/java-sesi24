public class luhnAlgorithm{
    public static void main(String[] args) {
       if(checkCreditCard("378282246310005")){
           System.out.println("valid!");
       }else{
           System.out.println("not valid");
       }
   }

   public static boolean checkCreditCard(String ccNumber) {
       int digitNumber= ccNumber.length(); // untuk mengambil panjang karakter dari input string
       int sum = 0; // inisialisasi sum
       int parity = (digitNumber - 2) % 2; // identifikasi untuk cek digit kedua
       int i = 0;
       for (i = 0;  i<digitNumber; i++) // perulangan sampai i kurang dari panjang karakter input string
       {
           int d = ccNumber.charAt(i);  // spesifikasi setiap karakter pada string input ke indexnya
           if (i % 2 == parity) //check apakah digit kedua atau bukan
           {
               d = d * 2; // mengalikan 2 nilai digit yang sesuai
           }
           if (d > 9) // cek digit jika lebih dari 9
           {
               d = d - 9; // maka digit harus dikurangi 9
           }
           sum = sum + d; // menambahkan sum dan digit
       }
       return (sum % 10 == 0);
   }
   
}