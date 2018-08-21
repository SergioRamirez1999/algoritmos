package com.sergio.algoritmos;

public class CopyPangrama {
    private static boolean isPangrama(char[] sistema, String frase){
        boolean flag = true;
        frase = frase.toLowerCase();
        if(sistema.length > 0 && frase.length() > 0){
            char[] vector_frase = new char[frase.length()];
            for(int i = 0; i < vector_frase.length; i++){
                vector_frase[i] = frase.charAt(i);
            }
            int i = 0, h = 0;
            boolean corte_externo = false;
            boolean corte_interno;

            while(i < sistema.length && !corte_externo){
                corte_interno = false;
                while(h < vector_frase.length && !corte_interno){
                    if(vector_frase[h] == sistema[i])
                        corte_interno = true;
                    h++;
                }

                if(!corte_interno)
                    corte_externo = true;
                h = 0;
                i++;
            }
            if(corte_externo)
                flag = false;
        }else {
            flag = false;
        }

        return flag;
    }

    public static void main(String[] args) {
        char[] espaniol = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o'
                ,'p','q','r','s','t','u','v','w','x','y','z'};
        System.out.println(CopyPangrama.isPangrama(espaniol, "Benjamín pidió una bebida de kiwi y fresa. Noé, sin vergüenza, la más exquisita champaña del menú"));
        System.out.println(CopyPangrama.isPangrama(espaniol, "Jovencillo emponzoñado de whisky, ¡qué figurota exhibe!"));
    }
}
