
public class CalculadoraBonus {
public int bonusDodia = 1;

public int bonus(Usuario u) {
	int multiplicador = bonusDodia;
	if(u.vip)
		multiplicador *= 5;
	return multiplicador;
}
}
