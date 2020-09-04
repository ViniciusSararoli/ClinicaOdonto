package br.com.clinica.model;

public class Paciente {
	private int MATRICULA;
	private String NOME;
	private String NASCIMENTO;
	private String SEXO;
	private String CONVENIO;
	private String RG;
	private String CPF;
	private String EMAIL;
	private String ENDERECO;
	private String BAIRRO;
	private String MUNICIPIO;
	private String UF;
	private String CEP;
	private String CELULAR;

	// construtores

	public Paciente() {

	}

	public Paciente(int MATRICULA, String NOME, String NASCIMENTO, String SEXO, String CONVENIO, String RG, String CPF,
			String EMAIL, String ENDERECO, String BAIRRO, String MUNICIPIO, String UF, String CEP, String CELULAR) {
		super();
		this.MATRICULA = MATRICULA;
		this.NOME = NOME;
		this.NASCIMENTO = NASCIMENTO;
		this.SEXO = SEXO;
		this.CONVENIO = CONVENIO;
		this.RG = RG;
		this.CPF = CPF;
		this.EMAIL = EMAIL;
		this.ENDERECO = ENDERECO;
		this.BAIRRO = BAIRRO;
		this.MUNICIPIO = MUNICIPIO;
		this.UF = UF;
		this.CEP = CEP;
		this.CELULAR = CELULAR;
	}

	// getters e setters

	public int getMATRICULA() {
		return MATRICULA;
	}

	public void setMATRICULA(int MATRICULA) {
		this.MATRICULA = MATRICULA;
	}

	public String getNOME() {
		return NOME;
	}

	public void setNOME(String NOME) {
		this.NOME = NOME;
	}

	public String getNASCIMENTO() {
		return NASCIMENTO;
	}

	public void setNASCIMENTO(String NASCIMENTO) {
		this.NASCIMENTO = NASCIMENTO;
	}

	public String getSEXO() {
		return SEXO;
	}

	public void setSEXO(String SEXO) {
		this.SEXO = SEXO;
	}

	public String getCONVENIO() {
		return CONVENIO;
	}

	public void setCONVENIO(String CONVENIO) {
		this.CONVENIO = CONVENIO;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String RG) {
		this.RG = RG;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String EMAIL) {
		this.EMAIL = EMAIL;
	}

	public String getENDERECO() {
		return ENDERECO;
	}

	public void setENDERECO(String ENDERECO) {
		this.ENDERECO = ENDERECO;
	}

	public String getBAIRRO() {
		return BAIRRO;
	}

	public void setBAIRRO(String BAIRRO) {
		this.BAIRRO = BAIRRO;
	}

	public String getMUNICIPIO() {
		return MUNICIPIO;
	}

	public void setMUNICIPIO(String MUNICIPIO) {
		this.MUNICIPIO = MUNICIPIO;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String UF) {
		this.UF = UF;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String CEP) {
		this.CEP = CEP;
	}

	public String getCELULAR() {
		return CELULAR;
	}

	public void setCELULAR(String CELULAR) {
		this.CELULAR = CELULAR;
	}

}
