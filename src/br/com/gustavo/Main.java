package br.com.gustavo;

import br.com.gustavo.dominio.*;

import javax.swing.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("descrição curso Java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso.setTitulo("Curso C#");
        curso.setDescricao("descrição curso C#");
        curso.setCargaHoraria(8);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição de Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Rodrigo");
        aluno1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rodrigo" + aluno1.getConteudosInscrito());
        aluno1.progredir();
        System.out.println("__________");
        System.out.println("Conteúdos Inscritos Rodrigo" + aluno1.getConteudosInscrito());
        System.out.println("Conteúdos Concluídos Rodrigo" + aluno1.getConteudosConcluido());
        System.out.println("XP: " + aluno1.calcularTotalXp());


        Aluno aluno2 = new Aluno();
        aluno2.setNome("Bruna");
        aluno2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bruna" + aluno2.getConteudosInscrito());
        aluno2.progredir();
        aluno2.progredir();
        aluno2.progredir();
        System.out.println("__________");
        System.out.println("Conteúdos Inscritos Bruna" + aluno2.getConteudosInscrito());
        System.out.println("Conteúdos Concluídos Bruna" + aluno2.getConteudosConcluido());
        System.out.println("XP: " + aluno2.calcularTotalXp());


    }
}
