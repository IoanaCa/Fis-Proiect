import java.time.LocalDate;

public class Eveniment {

	
		
		String titlu;
		String descriere;
		String data_incep;
		String data_sf;
		String cod_culoare;
		String tip_recurenta;
		boolean alarma;
		String ora_incep;
		String ora_sf;
		int recurenta_alarma;
		
		public Eveniment(String titlu, String descriere, String data_incep, String data_sf, String cod_culoare,
				String tip_recurenta, boolean alarma, String ora_incep, String ora_sf, int recurenta_alarma) {
			super();
			this.titlu = titlu;
			this.descriere = descriere;
			this.data_incep = data_incep;
			this.data_sf = data_sf;
			this.cod_culoare = cod_culoare;
			this.tip_recurenta = tip_recurenta;
			this.alarma = alarma;
			this.ora_incep = ora_incep;
			this.ora_sf = ora_sf;
			this.recurenta_alarma = recurenta_alarma;
		}
		
		public String getTitlu() {
			return titlu;
		}
		public void setTitlu(String titlu) {
			this.titlu = titlu;
		}
		public String getDescriere() {
			return descriere;
		}
		public void setDescriere(String descriere) {
			this.descriere = descriere;
		}
		public String getData_incep() {
			return data_incep;
		}
		public void setData_incep(String data_incep) {
			this.data_incep = data_incep;
		}
		public String getData_sf() {
			return data_sf;
		}
		public void setData_sf(String data_sf) {
			this.data_sf = data_sf;
		}
		public String getCod_culoare() {
			return cod_culoare;
		}
		public void setCod_culoare(String cod_culoare) {
			this.cod_culoare = cod_culoare;
		}
		public String getTip_recurenta() {
			return tip_recurenta;
		}
		public void setTip_recurenta(String tip_recurenta) {
			this.tip_recurenta = tip_recurenta;
		}
		public boolean isAlarma() {
			return alarma;
		}
		public void setAlarma(boolean alarma) {
			this.alarma = alarma;
		}
		public String getOra_incep() {
			return ora_incep;
		}
		public void setOra_incep(String ora_incep) {
			this.ora_incep = ora_incep;
		}
		public String getOra_sf() {
			return ora_sf;
		}
		public void setOra_sf(String ora_sf) {
			this.ora_sf = ora_sf;
		}
		public int getRecurenta_alarma() {
			return recurenta_alarma;
		}
		public void setRecurenta_alarma(int recurenta_alarma) {
			this.recurenta_alarma = recurenta_alarma;
		}
		
		@Override
		public String toString() {
			return "Eveniment [titlu=" + titlu + ", descriere=" + descriere + ", data_incep=" + data_incep
					+ ", data_sf=" + data_sf + ", cod_culoare=" + cod_culoare + ", tip_recurenta=" + tip_recurenta
					+ ", alarma=" + alarma + ", ora_incep=" + ora_incep + ", ora_sf=" + ora_sf + ", recurenta_alarma="
					+ recurenta_alarma + "]";
		}
		
		
		

}
