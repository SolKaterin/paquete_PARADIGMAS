package ej_6.sorting;

import java.util.List;

public class Buble {

    public static void bubbleSort(List<Object> list) 	{
        Ordenable temp;
        if (list.size()>1) {
            for (int i=0; i<list.size(); i++) {
                for (int j=0; j < list.size()-1; j++) {
                    if (((Ordenable) list.get(j)).compareTo(list.get(j+1)) >= 0) {
                        temp = (Ordenable) list.get(j);
                        list.set(j,list.get(j+1) );
                        list.set(j+1, temp);
                    }
                }
            }
        }
    }
}
