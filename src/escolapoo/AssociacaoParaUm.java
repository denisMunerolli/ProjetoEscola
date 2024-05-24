package escolapoo;

import java.sql.Date;

import escola.Aluno;
import escola.Turma;

public class AssociacaoParaUm {
	public static void name(String[] args) {
		
		Turma turma1 = new Turma();
		turma1.setSigla("1A");
		turma1.setAno(1);
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Alex");
		aluno1.setRa(1234);
		aluno1.setDataNascimento(new Date(1));
		aluno1.setTurma(turma1);
		turma1.adicionarAluno(aluno1);
		
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Joao");
		aluno2.setRa(124);
		aluno2.setDataNascimento(new Date(1));
		aluno2.setTurma(turma1);
		turma1.adicionarAluno(aluno2);
		
		System.out.print("Dados do aluno:");
		System.out.printf(aluno1.getNome());
		System.out.println(aluno1.getTurma().getSigla());
		
	}
}
