import java.text.DecimalFormat;

/**
 * Uma banda vai se apresentar numa arena onde,
 * do palco até a última pessoa que está assistindo ao show,
 * tem uma distância d (d pode ter diversos valores: 0,35 km, 0,6 km, 1,02 km).
 *
 * Sabendo que a velocidade do som é 340 m/s,
 * crie uma função que retorne em aproximadamente quanto tempo,
 * em milisegundos, o som sai da caixa de som até ser ouvido pela última pessoa?
 */

public class VelocidadeMedia {
    public static void main(String[] args) {
        System.out.println(retornaTempoArenaEmMilisegundos(0.45, 340));
        System.out.println(1325);
    }

    public static String retornaTempoArenaEmMilisegundos(Double distance, Integer velocidade) {
        //Distancia media -> v = Ds/Dt
        double distanceInM = distance*1000;
        double v = distanceInM/velocidade;
        DecimalFormat df = new DecimalFormat("#.###");

        return df.format(v);
    }
}
