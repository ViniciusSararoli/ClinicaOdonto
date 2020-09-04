package br.com.clinica.model;

public class Receita {	
		private int MATRICULA;
		private String MEDICAMENTO;
		private String QUANTIDADE;
		private String PRESCRICAO;
		

		public Receita() {
		}


		public Receita(int MATRICULA, String MEDICAMENTO, String QUANTIDADE, String PRESCRICAO) {
			super();
			this.MATRICULA = MATRICULA;
			this.MEDICAMENTO = MEDICAMENTO;
			this.QUANTIDADE =QUANTIDADE;
			this.PRESCRICAO = PRESCRICAO;
		}
		
		


		public int getMATRICULA() {
			return MATRICULA;
		}


	public void setMATRICULA(int MATRICULA) {
			this.MATRICULA = MATRICULA;
		}


		public String getMEDICAMENTO() {
			return MEDICAMENTO;
		}


		public void setMEDICAMENTO(String MEDICAMENTO) {
			this.MEDICAMENTO = MEDICAMENTO;
		}


		public String getQUANTIDADE() {
			return QUANTIDADE;
		}


		public void setQUANTIDADE(String QUANTIDADE) {
			this.QUANTIDADE = QUANTIDADE;
		}


		public String getPRESCRICAO() {
			return PRESCRICAO;
		}
		
		public void setPRESCRICAO(String PRESCRICAO) {
			this.PRESCRICAO = PRESCRICAO;
		}
	
		
}
