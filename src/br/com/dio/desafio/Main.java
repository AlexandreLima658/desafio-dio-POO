package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.dominio.Bootcamp;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;
public class Main {
	public static void main(String[] args) {
		 /* Curso 1 */
		 Curso curso1 = new Curso();
		 curso1.setTitulo("Java");
		 curso1.setDescricao("Java com POO");
		 curso1.setCargaHoraria(6);
		 /* Curso 2 */
		 Curso curso2 = new Curso();
		 curso2.setTitulo("JavaScript");
		 curso2.setDescricao("Principios básicos da linguagem");
		 curso2.setCargaHoraria(8);
		 /* Mentoria  */
		 Mentoria mentoria = new Mentoria();
		 mentoria.setTitulo("Java");
		 mentoria.setDescricao("Mentor em java");
		 mentoria.setData(LocalDate.now());
		 
		 
		 Bootcamp bootcamp = new Bootcamp();
		 bootcamp.setNome("Bootcamp Java");
		 bootcamp.setDescricao("Descrição bootcamp java");
		 bootcamp.getConteudos().add(curso1);
		 bootcamp.getConteudos().add(curso2);
		 bootcamp.getConteudos().add(mentoria);
	
		 Dev devAlexandre = new Dev();
		 devAlexandre.setNome("Carlos Alexandre");
		 devAlexandre.inscreverBootcamp(bootcamp);
		 System.out.println("Conteúdos Inscritos Alexandre: "+ devAlexandre.getConteudoInscritos());
		 
		 devAlexandre.progredir();
		 
		 System.out.println("Conteúdos Inscritos Alexandre: "+ devAlexandre.getConteudoInscritos());
		 System.out.println("Conteúdos Concluídos Alexandre: "+ devAlexandre.getConteudoConcluidos());
		 System.out.println("XP: " + devAlexandre.calcularXp());
		 System.out.println("-----------------------");
		 Dev devCarla = new Dev();
		 devCarla.setNome("Carla de Lima");
		 devCarla.inscreverBootcamp(bootcamp);
		 System.out.println("Conteúdos Inscritos Carla:  "+ devCarla.getConteudoInscritos());
		 
		 devCarla.progredir();
		 devCarla.progredir();
		 
		 System.out.println("Conteúdos Inscritos Carla:  "+ devCarla.getConteudoInscritos());
		 System.out.println("Conteúdos Concluídos Carla: "+ devCarla.getConteudoConcluidos());
		 System.out.println("XP: " + devCarla.calcularXp());
	}
}
