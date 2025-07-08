package atividadeCasa;

    public class atividade24_06 {
        String nomePassageiro;
        int Km;
        String classe;
        double preco;


        public atividade24_06(String nomePassageiro, int Km, String classe) {
            this.nomePassageiro = nomePassageiro;
            this.Km = Km;
            this.classe = classe;
        }
        double calculaValor(String escolha,int Km){
            if(escolha.equals("Economico") ){
                preco = Km * 0.50;
                System.out.printf("Valor: %.2f",preco);

            }
            else if(escolha.equals("Executiva")){
                preco = Km * 0.75;
                System.out.printf("Valor: %.2f",preco);
            }
            else if(escolha.equals("Primeira")){
                preco = Km * 1.00;
                System.out.printf("Valor: %.2f",preco);

            }
            return preco;
        }

        void exibiResumo(atividadeCasa.atividade24_06 p){
            System.out.println("Nome: " + p.nomePassageiro);
            System.out.println("Distância: " + p.Km);
            System.out.println("Classe: " + p.classe);
            calculaValor(p.classe, p.Km);
        }

        boolean compara(atividadeCasa.atividade24_06 outraPas){
            System.out.println("Preço p1: "+preco);
            System.out.println("Preço p2: "+outraPas.preco);
            if( preco > outraPas.preco ){
                return true;
            }
            return false;
        }

        public static void main(String[] args) {
            atividadeCasa.atividade24_06 p1 = new atividadeCasa.atividade24_06("Lucas", 300, "Executiva");
            p1.exibiResumo(p1);
            System.out.println("\n_________________________");
            atividadeCasa.atividade24_06  p2 = new atividadeCasa.atividade24_06("Felipe", 50, "Primeira");
            p2.exibiResumo(p2);
            System.out.println("\nValor de p1 é maior que p2? "+p1.compara(p2));


        }

    }
