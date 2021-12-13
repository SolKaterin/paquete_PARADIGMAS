package ej_6.sorting;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Objeto {

    public static void main(String[] args){

        List<Ordenable> personas = new ArrayList<Ordenable>();

        personas.add(new Persona(33333333));
        personas.add(new Persona(11111111));
        personas.add(new Persona(22222222));

        System.out.println("");

        for(Ordenable p : personas){
            Persona persona = (Persona) p;
            System.out.println(persona.getDni());
        }

        for(int i = 0; i < personas.size(); i++){
            for(int j = 0; j < personas.size(); j++){
                if(personas.get(i).esMayor(personas.get(j))){
                    Ordenable temp = personas.get(j);
                    personas.set(j, personas.get(i));
                    personas.set(i, temp);
                }
            }
        }

        for(Ordenable p : personas){
            Persona persona = (Persona) p;
            System.out.println(persona.getDni());
        }
        System.out.println();

        List<Ordenable> numeros = new ArrayList<Ordenable>();

        numeros.add(new Num(7));
        numeros.add(new Num(5));
        numeros.add(new Num(9));

        System.out.println("");
        System.out.println("desordenado" + " \n ");
        for(Ordenable o : numeros){
            Num n = (Num) o;
            System.out.println(n.num);
        }

        for(int i = 0; i < numeros.size(); i++){
            for(int j = 0; j < numeros.size(); j++){
                if(numeros.get(i).esMayor(numeros.get(j))){
                    Ordenable temp = numeros.get(j);
                    numeros.set(j, numeros.get(i));
                    numeros.set(i, temp);
                }if(((Num)numeros.get(i)).esIgual(numeros.get(j))){
                    Ordenable temp2 = numeros.get(i);
                    numeros.set(i, numeros.get(j));
                    numeros.set(j, temp2);
                }
            }
        }
        System.out.println("");
        System.out.println("ordenado" + " \n ");
        for(Ordenable o : numeros){
            Num n = (Num) o;
            System.out.println(n.num);
        }
        System.out.println();

        int[] nums = dameArrayAleatorio(7, false);

        System.out.println("Array Desordenado: ");
        for(int i = 0; i< nums.length; i++){
            if(i < nums.length-1){
                System.out.print(nums[i] + " , ");
            }else{
                System.out.print(nums[i]);
            }
        }

        bubbleSort(nums);
    }

    public static void bubbleSort(int[] array){
        boolean desordenado = true;
        boolean permuto;
        int valor;
        while(desordenado){
            permuto = false;
            for(int i = 1; i < array.length; i++){
                if(array[i] < array[i-1]){
                    valor = array[i-1];
                    array[i-1] = array[i];
                    array[i] = valor;
                    permuto = true;
                }
            }
            if(permuto == false) break;
        }

        System.out.println("\nbuble sort: ");
        for(int i = 0; i < array.length; i++){
            if(i < array.length-1){
                System.out.print(array[i] + " , ");
            }else{
                System.out.print(array[i]);
            }
        }

    }
    public static int[] dameArrayAleatorio(int tam, boolean ord){
        Random rand = new Random();
        int[] array = new int[tam];

        int num, manera_orden;

        if(ord){
            manera_orden = rand.nextInt(3);
            for(int i = 0; i < tam; i++){

                if(manera_orden == 0){
                    array[i] = (i + 1);
                }else if(manera_orden == 1){
                    array[i] = (i + 2) * 2;
                }else{
                    array[i] = (i + 3) * 3;
                }
            }
            return array;
        }else{
            for(int i = 0; i < tam; i++){
                num = rand.nextInt(1000);
                array[i] = num;
            }
            return array;
        }
    }
}