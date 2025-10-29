package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Long$Q;
import CC.$.Q$Q_LMNt.Q$Byt;

import java.util.Collection;

public interface Long$Byt extends Long$Q,Q$Byt
{
	Clas_Rap Class=Init_StRt_Nd(Long$Byt.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	byte Long$Byt(long In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Longg$Bytg(long[] From,byte[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Long$Byt(From[IndX]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default byte[] Longg$Bytg(long[] In)
			{
				byte[] Out=new byte[In.length];
				Longg$Bytg(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Longg$Bytg(Iterable<Long> From,Collection<Byte> To){for(long In:From){To.add(Long$Byt(In));}}
}