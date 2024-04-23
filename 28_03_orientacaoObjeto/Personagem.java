public class Personagem {

    String nome ; 
    int energia;
    int fome;
    int sono;

    void cacar(){
        if (energia >= 2){
            System.out.println(nome + "caçcado");
            energia = energia -2;
            fome = Math.min(fome + 1, 10);
            sono = Math.min(sono + 1, 10);
        } else {
            System.out.println(nome + "exausto...");
        }
    }
    void comer(){
        if (fome >= 1){
            System.out.println(nome + "comendo");
            fome --;
            energia = Math.min(energia +1, 10);
        } else {
            System.out.println(nome + " esta cheio");
        }
    }
    void dormir(){
        if (sono >= 1){
            System.out.println(nome + "zzzZzzZZzzz");
            sono --;
            energia = Math.min(energia +1, 10);
        } else {
            System.out.println(nome + " Sem sono");
        }
    }
}