package net.darkhax.noworldgen5you.world.gen;

import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.structure.MapGenStronghold;

public class MapGenStrongholdEmpty extends MapGenStronghold {

    @Override
    public void generate (World worldIn, int x, int z, ChunkPrimer primer) {

    }

    @Override
    public boolean canSpawnStructureAtCoords (int chunkX, int chunkZ) {

        return false;
    }
}