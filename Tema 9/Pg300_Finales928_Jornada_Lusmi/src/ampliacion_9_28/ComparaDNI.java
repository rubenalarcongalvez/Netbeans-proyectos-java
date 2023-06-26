/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ampliacion_9_28;

import java.util.Comparator;

/**
 *
 * @author Luis
 */
public class ComparaDNI implements Comparator<Jornada> {

	@Override
	public int compare(Jornada o1, Jornada o2) {
		return o1.getDNI().compareTo(o2.getDNI());
	}

}