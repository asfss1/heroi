public class Heroi {
    public static void main(String[] args) {
        // Variáveis para armazenar o nome e a quantidade de experiência (XP) de um herói
        String nome_Heroi = "Aslan";
        int xp_Heroi = 5800;
        
        // Variável para    armazenar a classificação
        String nivel;
        
        // Estrutura de decisão para determinar a classificação com base na XP
        if (xp_Heroi < 1000) {
            nivel = "Ferro";
        } else if (xp_Heroi <= 2000) {
            nivel = "Bronze";
        } else if (xp_Heroi <= 5000) {
            nivel = "Prata";
        } else if (xp_Heroi <= 7000) {
            nivel= "Ouro";
        } else if (xp_Heroi <= 8000) {
            nivel = "Platina";
        } else if (xp_Heroi <= 9000) {
            nivel = "Ascendente";
        } else if (xp_Heroi <= 10000) {
            nivel= "Imortal";
        } else {
            nivel = "Radiante";
        }
        
        // Apresentação da mensagem
        System.out.println("O heroi " + nome_Heroi + " tem " + xp_Heroi + " XP e está no nivel " + nivel + ".");
    }
}