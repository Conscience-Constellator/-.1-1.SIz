package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.Util.By.LMNt.Get_Q_By_Byt;
import CC.$.Q$Q_LMNt.Byt$Q;
import CC.$.Q$Q_LMNt.Q$Long;

import java.util.Collection;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Byt$Long extends Byt$Q,Q$Long
{
	Clas_Rap Class=Init_StRt_Nd(Byt$Long.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	long Byt$Long(byte In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Bytg$Longg(byte[] From,long[] To){for(int Indx=0;Indx<From.length;Indx+=1){To[Indx]=(Byt$Long(From[Indx]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default long[] Bytg$Longg(byte[] In)
			{
				long[] Out=new long[In.length];
				Bytg$Longg(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Bytg$Longg(Iterable<Byte> From,Collection<Long> To){for(byte In:From){To.add(Byt$Long(In));}}
}