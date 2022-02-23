import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import javax.swing.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Logica de programação");
        curso1.setDescricao("curso de logica de programação");
        curso1.setCargaHoraria(11);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java");
        curso2.setDescricao("Curso de Java");
        curso2.setCargaHoraria(22);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria curso Java");
        mentoria.setDescricao("Vantagens e atividades com Java atualmente");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer 2022");
        bootcamp.setDescricao("Bootcamp Java Developer 2022 para Devs Jr");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Leandro");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos inscritos: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("===================================================================================");

        Dev dev2 = new Dev();
        dev2.setNome("Barbara");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos inscritos: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());

    }
}
