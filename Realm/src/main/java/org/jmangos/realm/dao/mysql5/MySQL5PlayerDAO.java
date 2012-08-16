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
package org.jmangos.realm.dao.mysql5;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.jmangos.commons.database.DB;
import org.jmangos.realm.dao.PlayerDAO;
import org.jmangos.realm.model.InventoryTemplate;
import org.jmangos.realm.model.player.PlayerCharacterData;
import org.jmangos.realm.model.player.PlayerHomeBindData;
import org.springframework.stereotype.Component;

/**
 * The Class MySQL5PlayerDAO.
 */
@Component
public class MySQL5PlayerDAO extends PlayerDAO {

	/** The Constant log. */
	private static final Logger log = Logger.getLogger(MySQL5PlayerDAO.class);

	/**
	 * 
	 * @see org.jmangos.realm.dao.PlayerDAO#loadHomeBind(int)
	 */
	@Override
	public PlayerHomeBindData loadHomeBind(int guid) {
		PlayerHomeBindData phbd = null;
		PreparedStatement st = DB
				.prepareStatement("SELECT map,zone,position_x,position_y,position_z FROM characters.character_homebind WHERE guid = ?");

		try {
			st.setInt(1, guid);
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				phbd = new PlayerHomeBindData(rs.getFloat("position_x"),
						rs.getFloat("position_y"), rs.getFloat("position_z"),
						rs.getInt("map"), rs.getShort("zone"));
			}
		} catch (SQLException e) {
			log.error("Can't load HomeBindData for player " + guid, e);
		} finally {
			DB.close(st);
		}

		return phbd;
	}

	/**
	 * 
	 * @see org.jmangos.realm.dao.PlayerDAO#loadFromDB(int)
	 */
	@Override
	public PlayerCharacterData loadFromDB(int guid) {
		PlayerCharacterData phbd = null;
		PreparedStatement st = DB
				.prepareStatement("SELECT guid, account, name, race, class, gender, level, xp, money, playerBytes, playerBytes2, playerFlags,"
						+ "position_x, position_y, position_z, map, orientation, taximask, cinematic, totaltime, leveltime, rest_bonus, logout_time, is_logout_resting, resettalents_cost,"
						+ "resettalents_time, trans_x, trans_y, trans_z, trans_o, transguid, extra_flags, stable_slots, at_login, zone, online, death_expire_time, taxi_path, dungeon_difficulty,"
						+ "arenaPoints, totalHonorPoints, todayHonorPoints, yesterdayHonorPoints, totalKills, todayKills, yesterdayKills, chosenTitle, knownCurrencies, watchedFaction, drunk,"
						+ "health, power1, power2, power3, power4, power5, power6, power7, specCount, activeSpec, exploredZones, equipmentCache, ammoId, knownTitles, actionBars FROM characters.characters WHERE guid = ?");

		try {
			st.setInt(1, guid);
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				phbd = new PlayerCharacterData(rs.getInt("xp"),
						rs.getString("exploredZones"),
						rs.getString("knownTitles"), rs.getInt("money"),
						rs.getInt("drunk"), (int) rs.getLong("watchedFaction"),
						rs.getLong("knownCurrencies"), rs.getInt("ammoId"),
						(byte) rs.getInt("actionBars"));
			}
		} catch (SQLException e) {
			log.error("Can't load PlayerCharacterData for player " + guid, e);
		} finally {
			DB.close(st);
		}

		return phbd;
	}

	/**
	 * 
	 * @see org.jmangos.realm.dao.PlayerDAO#loadInventory(int)
	 */
	@Override
	public List<InventoryTemplate> loadInventory(int guid) {
		PreparedStatement st = DB
				.prepareStatement("SELECT data,text,bag,slot,item,item_template FROM characters.character_inventory JOIN characters.item_instance ON character_inventory.item = item_instance.guid WHERE character_inventory.guid = ? ORDER BY bag,slot;");
		List<InventoryTemplate> itl = new ArrayList<InventoryTemplate>();
		try {
			st.setFetchSize(Integer.MIN_VALUE);
			st.setInt(1, guid);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				itl.add(new InventoryTemplate(rs.getString("data"), rs
						.getInt("bag"), rs.getByte("slot"), rs.getInt("item"),
						rs.getInt("item_template")));
			}
			rs.close();
		} catch (Exception e) {
			log.error("Can't load loadInventory  ", e);
		} finally {
			DB.close(st);
		}
		return itl;
	}
}