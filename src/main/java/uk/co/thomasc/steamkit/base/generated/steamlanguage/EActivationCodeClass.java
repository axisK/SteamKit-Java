package uk.co.thomasc.steamkit.base.generated.steamlanguage;

public enum EActivationCodeClass {
	WonCDKey(0),
	ValveCDKey(1),
	Doom3CDKey(2),
	DBLookup(3),
	Steam2010Key(4),
	Max(5),
	Test(2147483647),
	Invalid(4294967295L), ;

	private long code;

	private EActivationCodeClass(long code) {
		this.code = code;
	}

	public long v() {
		return code;
	}
}
