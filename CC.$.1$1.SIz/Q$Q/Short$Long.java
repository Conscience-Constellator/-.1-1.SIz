package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Q$Long;
import CC.$.Q$Q_LMNt.Short$Q;
import java.util.Collection;

public interface Short$Long extends Short$Q,Q$Long
{
	Clas_Rap Class=Init_StRt_Nd(Short$Long.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	long Short$Long(short In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Shortg$Longg(short[] From,long[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Short$Long(From[IndX]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default long[] Shortg$Longg(short[] In)
			{
				long[] Out=new long[In.length];
				Shortg$Longg(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Shortg$Longg(Iterable<Short> From,Collection<Long> To){for(short In:From){To.add(Short$Long(In));}}
}