/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array3;

/**
 *
 * @author user
 */
public class Array3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][]keluarga={{"ayah","Mukapi"},{"ibu","Kholilah"},
            {"anak1","Rini Triwahyuni"},
            {"anak2","Budi Prasetyo"},
            {"anak3 saya","Bagus hartanto"},
            {"anak4","Cicik qurnia wati"},
            {"anak5","Rindi indah nirwani"},
            {"anak6","M.Rizky abadi"},};
            for (int x =0; x < keluarga.length; x++){
            System.out.println("Status:" + keluarga [x][0]);
            System.out.println("Nama:"+keluarga [x] [1]);
            System.out.println("-----------------------------");
    }
    
}}
