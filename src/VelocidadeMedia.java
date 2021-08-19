import java.math.BigDecimal;

/**
 * Uma banda vai se apresentar numa arena onde,
 * do palco até a última pessoa que está assistindo ao show,
 * tem uma distância d (d pode ter diversos valores: 0,35 km, 0,6 km, 1,02 km).
 * <p>
 * Sabendo que a velocidade do som é 340 m/s,
 * crie uma função que retorne em aproximadamente quanto tempo,
 * em milisegundos, o som sai da caixa de som até ser ouvido pela última pessoa?
 */

public class VelocidadeMedia {
    public static void main(String[] args) {
        System.out.println(retornaTempoArenaEmMilisegundos("0.6", 340));
        System.out.println(1325);
    }

    public static Integer retornaTempoArenaEmMilisegundos(String distancia, Integer velocidade) {
        //Distancia media -> v = Ds/Dt
        double distanceInM = Double.parseDouble(distancia) * 1000;
        var v = distanceInM / velocidade;

        float number = BigDecimal.valueOf(v)
                .setScale(3, BigDecimal.ROUND_HALF_DOWN)
                .floatValue();
        number *= 1000;

        return (int) number;
    }
}
