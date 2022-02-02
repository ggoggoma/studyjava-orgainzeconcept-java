package spring.di.ui;

import spring.di.entitiy.Exam;

public class GridExamConsole implements ExamConsole {

	private Exam exam;
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}	
	
	@Override
	public void print() {
		System.out.println("______________________");
		System.out.println("|         |          |");
		System.out.println("|  total  |    avg   |");
		System.out.println("|_________|__________|");
		System.out.println("|         |          |");
		System.out.printf(" |  %3d    |    %3.2f |\n", exam.total(), exam.avg());
		System.out.println("|_________|__________|");

	}

}
