package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Long$Q;
import CC.$.Q$Q_LMNt.Q$Short;

import java.util.Collection;

public interface Long$Short extends Long$Q,Q$Short
{
	Clas_Rap Class=Init_StRt_Nd(Long$Short.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	short Long$Short(long In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Longg$Shortg(long[] From,short[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Long$Short(From[IndX]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default short[] Longg$Shortg(long[] In)
			{
				short[] Out=new short[In.length];
				Longg$Shortg(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Longg$Shortg(Iterable<Long> From,Collection<Short> To){for(long In:From){To.add(Long$Short(In));}}
}