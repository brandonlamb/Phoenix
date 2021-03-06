// Generated by delombok at Sat Jul 01 03:46:04 EEST 2017
package com.ontalsoft.flc.lib.chunks;

import java.io.IOException;
import com.ontalsoft.flc.lib.FLCChunk;
import com.ontalsoft.flc.lib.FLCFile;
import com.ontalsoft.flc.util.BinaryReader;

public class FLCChunkDeltaFLC extends FLCChunk {
	private byte[] payload;

	public FLCChunkDeltaFLC(FLCFile flcFile) {
		super(flcFile);
	}

	@Override
	protected void readChunk(BinaryReader reader) throws IOException {
		payload = reader.readBytes(size - 6);
	}

	@java.lang.SuppressWarnings("all")
	@javax.annotation.Generated("lombok")
	public byte[] getPayload() {
		return this.payload;
	}
}
