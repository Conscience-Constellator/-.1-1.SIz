package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Byt$Q;
import CC.$.Q$Q_LMNt.Q$Short;

import java.util.Collection;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Byt$Short extends Byt$Q,Q$Short
{
	Clas_Rap Class=Init_StRt_Nd(Byt$Short.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	short Byt$Short(byte In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Bytg$Shortg(byte[] From,short[] To){for(int Indx=0;Indx<From.length;Indx+=1){To[Indx]=(Byt$Short(From[Indx]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default short[] Bytg$Shortg(byte[] In)
			{
				short[] Out=new short[In.length];
				Bytg$Shortg(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Bytg$Shortg(Iterable<Byte> From,Collection<Short> To){for(byte In:From){To.add(Byt$Short(In));}}
}