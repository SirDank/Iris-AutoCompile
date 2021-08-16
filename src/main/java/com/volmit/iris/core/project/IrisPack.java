/*
 * Iris is a World Generator for Minecraft Bukkit Servers
 * Copyright (c) 2021 Arcane Arts (Volmit Software)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.volmit.iris.core.project;

import com.volmit.iris.core.project.loader.IrisData;
import com.volmit.iris.engine.object.dimensional.IrisDimension;
import lombok.Data;

import java.io.File;

@Data
public class IrisPack {
    private final File folder;

    public IrisPack(File folder)
    {
        this.folder = folder;
    }

    public String getName()
    {
        return getFolder().getName();
    }
}