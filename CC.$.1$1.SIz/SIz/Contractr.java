package CC.$.SIz;

import CC.COd.Finishd;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.$.Q$Q.*;

@Finishd(Is_Finishd=true)
public interface Contractr extends
	Short$Byt,Int$Short,Long$Int,
	Int$Byt,Long$Short,
	Long$Byt
{
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default byte Int$Byt(int Wrd)
	{return Short$Byt(Int$Short(Wrd));}
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default short Long$Short(long Wrd)
	{return Int$Short(Long$Int(Wrd));}
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default byte Long$Byt(long Wrd)
	{return Short$Byt(Long$Short(Wrd));}
}