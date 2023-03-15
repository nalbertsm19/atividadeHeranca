package models;

public class Pessoa 
{private String nome;
 private String dataNascimento;
 
 public Pessoa(String nome, String dataNascimento)
 { this.nome= nome;
   this.dataNascimento= dataNascimento;
	 
 }
public Pessoa() 
{
	
}

public String getNome() 
{
	return nome;
}
public void setNome(String nome) 
{
	this.nome = nome;
}
public String getDataNascimento() 
{
	return dataNascimento;
}
public void setDataNascimento(String dataNascimento) 
{
	this.dataNascimento = dataNascimento;
}
 
 

}
