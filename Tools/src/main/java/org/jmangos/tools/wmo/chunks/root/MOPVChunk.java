/*******************************************************************************
 * Copyright (C) 2012 JMaNGOS <http://jmangos.org/>
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the
 * Free Software Foundation; either version 2 of the License, or (at your
 * option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program. If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package org.jmangos.tools.wmo.chunks.root;

import java.nio.ByteBuffer;

import org.jmangos.tools.chunk.BaseChunk;
import org.jmangos.tools.wmo.chunks.WMOChunk;

/**
 * Chunk <tt>MOPT</tt><br>
 * Portal vertices. 
 * 
 * @author MinimaJack
 * 
 */
public class MOPVChunk extends WMOChunk{
	Float32[] vertices;		

	@Override
	public BaseChunk reads(ByteBuffer bb, int offset, int size) {
		setGlobalOffset(offset + size + HEADERSIZE);
		this.setByteBuffer(bb, offset);
		vertices = array(new Float32[size/4]);
		return this;	
	}
	public String toString(){
		return "[MOPVChunk] \n\tVertices count:" + vertices.length;
	}
}
