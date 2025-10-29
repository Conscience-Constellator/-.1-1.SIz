package CC.$.SIz;

import CC.COd.Finishd;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.$.Q$Q.*;

@Finishd(Is_Finishd=true)
public interface Xpandr extends
	Byt$Short,Short$Int,Int$Long,
	Byt$Int,Short$Long,
	Byt$Long
{
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default int Byt$Int(byte Wrd)
	{return Short$Int(Byt$Short(Wrd));}
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default long Short$Long(short Wrd)
	{return Int$Long(Short$Int(Wrd));}
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default long Byt$Long(byte Wrd)
	{return Int$Long(Byt$Int(Wrd));}
}