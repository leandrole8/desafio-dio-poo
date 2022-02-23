import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import javax.swing.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("curso de java");
        curso1.setCargaHoraria(11);

        Curso curso2 = new Curso();
        curso2.setTitulo("Logica de Programação");
        curso2.setDescricao("Curso de logica de programação");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria curso Java");
        mentoria.setDescricao("Vantagens e atividades com Java atualmente");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
