public class While {

    public static void main(String[] args) {
        
        double mesada = 50.0; //Valor da mesada

        while(mesada > 0) { //Enquanto a mesada for maior que 0
            double doce = 10; //Valor do doce

            if(doce > mesada){
                doce = mesada; //Se o valor do doce for maior que a mesada, o valor do doce será igual a mesada
            }

            System.out.println("Doce: " + doce); //Imprime o valor do doce
            mesada -= doce; //Subtrai o valor do doce da mesada
            System.out.println("Mesada: " + mesada); //Imprime o valor da mesada
        }
    }
    
}
