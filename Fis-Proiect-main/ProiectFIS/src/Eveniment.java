
public class Eveniment {

	
		
		String titlu;
		String descriere;
		String data_ora_incep;
		String data_ora_sf;
		String cod_culoare;
		boolean alarma;
		int recurenta_alarma;
		String tip_recurenta;
		int interval;
		public Eveniment(int interval) {
			super();
			this.interval = interval;
		}
		public int getInterval() {
			return interval;
		}
		public void setInterval(int interval) {
			this.interval = interval;
		}
		public Eveniment(String titlu, String descriere, String data_ora_incep, String data_ora_sf, String cod_culoare,
				boolean alarma, int recurenta_alarma, String tip_recurenta,int interval) {
			super();
			this.titlu = titlu;
			this.descriere = descriere;
			this.data_ora_incep = data_ora_incep;
			this.data_ora_sf = data_ora_sf;
			this.cod_culoare = cod_culoare;
			this.alarma = alarma;
			this.recurenta_alarma = recurenta_alarma;
			this.tip_recurenta = tip_recurenta;
			this.interval= interval;
		}
		@Override
		public String toString() {
			return "Eveniment [titlu=" + titlu + ", descriere=" + descriere + ", data_ora_incep=" + data_ora_incep
					+ ", data_ora_sf=" + data_ora_sf + ", cod_culoare=" + cod_culoare + ", alarma=" + alarma
					+ ", recurenta_alarma=" + recurenta_alarma + ", tip_recurenta=" + tip_recurenta + ", interval="
					+ interval + "]";
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
		public String getData_ora_incep() {
			return data_ora_incep;
		}
		public void setData_ora_incep(String data_ora_incep) {
			this.data_ora_incep = data_ora_incep;
		}
		public String getData_ora_sf() {
			return data_ora_sf;
		}
		public void setData_ora_sf(String data_ora_sf) {
			this.data_ora_sf = data_ora_sf;
		}
		public String getCod_culoare() {
			return cod_culoare;
		}
		public void setCod_culoare(String cod_culoare) {
			this.cod_culoare = cod_culoare;
		}
		public boolean isAlarma() {
			return alarma;
		}
		public void setAlarma(boolean alarma) {
			this.alarma = alarma;
		}
		public int getRecurenta_alarma() {
			return recurenta_alarma;
		}
		public void setRecurenta_alarma(int recurenta_alarma) {
			this.recurenta_alarma = recurenta_alarma;
		}
		public String getTip_recurenta() {
			return tip_recurenta;
		}
		public void setTip_recurenta(String tip_recurenta) {
			this.tip_recurenta = tip_recurenta;
		}
		
		

}
