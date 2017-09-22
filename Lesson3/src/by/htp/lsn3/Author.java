package by.htp.lsn3;

public class Author {
	private String name;
	private String surname;
	private String otchestvo;
	private String datebirth;
	
	public Author(String name, String surname, String otchestvo, String datebirth) {
		this.name = name;
		this.surname = surname;
		this.otchestvo = otchestvo;
		this.datebirth = datebirth;		
	}
	
	public void getAuthor(){
		System.out.println(name);
		System.out.println(surname);
		System.out.println(otchestvo);
		System.out.println(datebirth);
	}
	
	public String getSurname(){
		return surname;
	}
	
	public void setSurname(String surname)
	{
		this.surname = surname;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}
