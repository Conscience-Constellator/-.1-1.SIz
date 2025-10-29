package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Q$Short;
import CC.$.Q$Q_LMNt.Short$Q;

import java.util.Collection;

public interface Short$Byt extends Short$Q,Q$Short
{
	Clas_Rap Class=Init_StRt_Nd(Short$Byt.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	byte Short$Byt(short In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Shortg$Bytg(short[] From,byte[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Short$Byt(From[IndX]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default byte[] Shortg$Bytg(short[] In)
			{
				byte[] Out=new byte[In.length];
				Shortg$Bytg(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Shortg$Bytg(Iterable<Short> From,Collection<Byte> To){for(short In:From){To.add(Short$Byt(In));}}
}