package model;

public class Indirizzo {
    private int id;
	private String provincia;
    private String citt�;
    private String cap;
    private String via;
    private String interno;
    private String numeroCivico;
    private int user;
    
    public Indirizzo() {
		super();
	}
	public Indirizzo(int id, String provincia, String citt�, String cap, String via, String interno,
			String numeroCivico, int user) {
		super();
		this.id = id;
		this.provincia = provincia;
		this.citt� = citt�;
		this.cap = cap;
		this.via = via;
		this.interno = interno;
		this.numeroCivico = numeroCivico;
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getCitt�() {
		return citt�;
	}
	public void setCitt�(String citt�) {
		this.citt� = citt�;
	}
	public String getCap() {
		return cap;
	}
	public void setCap(String cap) {
		this.cap = cap;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public String getInterno() {
		return interno;
	}
	public void setInterno(String interno) {
		this.interno = interno;
	}
	public String getNumeroCivico() {
		return numeroCivico;
	}
	public void setNumeroCivico(String numeroCivico) {
		this.numeroCivico = numeroCivico;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}

     
}