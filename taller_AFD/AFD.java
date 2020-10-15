import java.util.*;

/**
 * Clase que representa la implementación base (incompleta) de un Automata de Estados Finitos Determinista
 * La implementación no contiene:
 * -Manejo de excepciones
 * -Transiciones que no están explícitas
 */
public class AFD{
    
    /**
     * Función de transición.
     */
    private HashMap<Estado,HashMap<Character,Estado>> delta;
    /**
     * Estado inicial
     */
    private Estado inicial;
    /**
     * Estados finales
     */
    private List<Estado> finales;
    //EL alfabeto es el conjunto de Character

    /***
     * Construye un autómata de estados finitos determinista
     * El HashMap delta corresponde a la función de transición, por cada estado determina que transiciones "salen" de ese estado
     * El estado inicial
     * Una lista con los estados finales
     */
    public AFD(HashMap<Estado,HashMap<Character,Estado>> delta,Estado inicial,List<Estado> finales){
        this.delta=delta;
        this.inicial=inicial;
        this.finales=finales;
    }

    /**
     * Función de transición básica, dado un estado y un caracter retorna el nuevo estado
     * -No hay manejo de transiciones que no están explícitas en la función de transición
     */
    private Estado funcionDelta(Estado q,Character c){
        //Falta manejo de excepciones
        return delta.get(q).get(c);
    }

    /***
     * Función de transición extendida. Dado un estado (q) y una cadena de caracteres (cadena), retorna
     * el estado final.
     */
    private Estado funcionDeltaExtendidaRecursiva(Estado q,String cadena){
        // falta manejo de excepciones
        if (cadena.length()==1){
            return funcionDelta(q,cadena.charAt(0));
        }
        return funcionDelta(funcionDeltaExtendidaRecursiva(q,cadena.substring(0,cadena.length()-1)),cadena.charAt(cadena.length()-1));
    }
    
    private Estado funcionDeltaExtendidaIterativa(Estado q,String cadena){
        // falta manejo de excepciones
        Estado e =  null;
        boolean bandera= true;
        for (int i =0; i<cadena.length(); ++i)
        {
            if (bandera==true) 
            {
                e = funcionDelta(q,cadena.charAt(i));
                bandera=false;
            }else{
                q = funcionDelta(e,cadena.charAt(i));
                bandera=true;
            }
        }
        if (bandera== true){
            return q;
        }
        else{
            return e ;
        }
    }

    /***
     * Función que valida si dada un cadena de caracteres (w) el autómata termina en un estado final
     * iniciando el el estado inicial.
     */
    public Boolean validarEntrada(String w){
        return finales.contains(funcionDeltaExtendidaRecursiva(inicial,w));
    }

    /***
     * Clase que representa un estado genérico de un autómata. Los estado se identifican por un nombre.
     */
    public static class Estado{
        private String nombre;

        /***
         * Construye un estado a partir del nombre
         */
        public Estado(String nombre){
            this.nombre=nombre;
        }

        @Override
        public int hashCode(){
            return nombre.hashCode();
        }

        @Override
        public String toString(){
            return nombre;
        }
    }

    public static void main(String[] args) {
        System.out.println("Prueba de AFD que determina si una cadena de caracteres tiene una cantidad impar de '1's");
        Estado qEven=new Estado("qEven");
        Estado qOdd=new Estado("qOdd");
        List<Estado> finales=new LinkedList<Estado>();
        finales.add(qOdd);
        HashMap<Estado,HashMap<Character,Estado>> delta=new HashMap<Estado,HashMap<Character,Estado>>(2);
        HashMap<Character,Estado> dEven=new HashMap<Character,Estado>(2);
        dEven.put('0',qEven);
        dEven.put('1',qOdd);
        delta.put(qEven,dEven);
        HashMap<Character,Estado> dOdd=new HashMap<Character,Estado>(2);
        dOdd.put('0',qOdd);
        dOdd.put('1',qEven);
        delta.put(qOdd, dOdd);
        AFD unosImpares=new AFD(delta, qEven, finales);
        String[] cadenas={

            "11011",
            "011000111001111",
            "01",
            "1",
            "11111",
            "111000011111"
        };
        for (String c:cadenas){
            System.out.println(c+" - "+unosImpares.validarEntrada(c));
        }
    }
}


/* 
            
*/