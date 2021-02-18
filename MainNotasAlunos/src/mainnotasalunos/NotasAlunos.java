package mainnotasalunos;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class NotasAlunos {
    private String nome;
    private String rgm;
    private double[] notas;
    private float media;

    public NotasAlunos() {
    }

    public NotasAlunos(String nome, String rgm, double[] notas, float media) {
        this.nome = nome;
        this.rgm = rgm;
        this.notas = notas;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public String getRgm() {
        return rgm;
    }

    public double[] getNotas() {
        return notas;
    }

    public float getMedia() {
        return media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void setMedia(float media) {
        this.media = media;
    }
    
    public void entrada(){
        notas = new double[5];
        nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno: ");
        rgm = JOptionPane.showInputDialog(null, "Digite o RGM do aluno: ");
        for(int i = 0; i < notas.length; i++){
            notas[i] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a " + (i+1) + "ª nota: "));
        }
    }
    
    public float calculaMedia(){
        float soma = 0;
        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        media = soma / notas.length;
        return media;
    }
    
    public void imprimir(){
        String print;
        print = "Nome: " + nome + "\n";
        print += "RGM: " + rgm + "\n";
        print += "Notas: ";
        Arrays.sort(notas);
        for(int i = 0; i < notas.length; i++){
            print += "[" + notas[i] + "]";
        }
        print += "\n";
        print += "Média: " + media + "\n";
        System.out.println("Dados do aluno: \n" + print);
    }
    
}
