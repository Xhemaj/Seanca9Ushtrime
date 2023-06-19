package ushtrimeseanca9;

import java.util.Arrays;
//3. Shkruaj një program që kopjon një array në një array
//tjetër duke mos përfshirë elementin që ndodhet në pozicionin X të arrayt origjinal. 
//Psh: nëse array orgjinal ka vlerat { 1, 5, 7, 9} 
//Elementi që do fshihet është elementi i tretë : pra, elementi 7 
//Array i ri duhet të ketë vlerat : 1, 5, 9 

public class ushtrimi3 {
    public static void main(String[] args) {
        int[] sourceArray = {1, 5, 7, 9};
        int indexToRemove = 2; // Elementi në pozicionin e tretë (indeksi fillon nga 0)

        // Gjej gjatësinë e array-it tjetër duke mos përfshirë elementin për t'u larguar
        int newSize = sourceArray.length - 1;
        int[] destinationArray = new int[newSize];

        // Kopjo elementet e array-it origjinal në array-in e destinacionit duke mos përfshirë elementin për t'u larguar
        int destinationIndex = 0;
        for (int i = 0; i < sourceArray.length; i++) {
            if (i != indexToRemove) {
                destinationArray[destinationIndex] = sourceArray[i];
                destinationIndex++;
            }
        }

        // Printo array-in e destinacionit
        System.out.println(Arrays.toString(destinationArray));
    }}