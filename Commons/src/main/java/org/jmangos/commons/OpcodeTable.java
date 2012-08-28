package org.jmangos.commons;

/**
 * Created with IntelliJ IDEA. User: Goofy Date: 2012.08.08. Time: 11:54 To change this template use
 * File | Settings | File Templates.
 */
public enum OpcodeTable {
    MSG_NULL_ACTION(0x000),
    CMSG_BOOTME(0x001), // not used in client
    CMSG_DBLOOKUP(0x002), // not used in client
    SMSG_DBLOOKUP(0x003), // not used in client
    CMSG_QUERY_OBJECT_POSITION(0x004), // not used in client
    SMSG_QUERY_OBJECT_POSITION(0x005), // not used in client
    CMSG_QUERY_OBJECT_ROTATION(0x006), // not used in client
    SMSG_QUERY_OBJECT_ROTATION(0x007), // not used in client
    CMSG_WORLD_TELEPORT(0x008), // implemented
    CMSG_TELEPORT_TO_UNIT(0x009), // implemented
    CMSG_ZONE_MAP(0x00A), // GM client only
    SMSG_ZONE_MAP(0x00B), // GM client only
    CMSG_DEBUG_CHANGECELLZONE(0x00C), // development client only
    CMSG_MOVE_CHARACTER_CHEAT(0x00D), // GM client only
    SMSG_MOVE_CHARACTER_CHEAT(0x00E), // GM client only
    CMSG_RECHARGE(0x00F), // GM client only
    CMSG_LEARN_SPELL(0x010), // GM client only
    CMSG_CREATEMONSTER(0x011), // GM client only
    CMSG_DESTROYMONSTER(0x012), // GM client only
    CMSG_CREATEITEM(0x013), // GM client only
    CMSG_CREATEGAMEOBJECT(0x014), // GM client only
    SMSG_CHECK_FOR_BOTS(0x015), // / TODO: investigate
    CMSG_MAKEMONSTERATTACKGUID(0x016), // GM client only
    CMSG_BOT_DETECTED2(0x017), // / TODO: investigate
    CMSG_FORCEACTION(0x018), // GM client only
    CMSG_FORCEACTIONONOTHER(0x019), // GM client only
    CMSG_FORCEACTIONSHOW(0x01A), // GM client only
    SMSG_FORCEACTIONSHOW(0x01B), // handled, but unused.
    CMSG_PETGODMODE(0x01C), // GM client only
    SMSG_PETGODMODE(0x01D), // / TODO: implement
    SMSG_REFER_A_FRIEND_EXPIRED(0x01E), // / TODO: implement
    CMSG_WEATHER_SPEED_CHEAT(0x01F), // not used in client
    CMSG_UNDRESSPLAYER(0x020), // not used in client
    CMSG_BEASTMASTER(0x021), // not used in client
    CMSG_GODMODE(0x022), // GM client only
    SMSG_GODMODE(0x023), // / TODO: implement
    CMSG_CHEAT_SETMONEY(0x024), // GM client only
    CMSG_LEVEL_CHEAT(0x025), // GM client only
    CMSG_PET_LEVEL_CHEAT(0x026), // GM client only
    CMSG_SET_WORLDSTATE(0x027), // GM client only
    CMSG_COOLDOWN_CHEAT(0x028), // GM client only
    CMSG_USE_SKILL_CHEAT(0x029), // GM client only
    CMSG_FLAG_QUEST(0x02A), // GM client only
    CMSG_FLAG_QUEST_FINISH(0x02B), // GM client only
    CMSG_CLEAR_QUEST(0x02C), // GM client only
    CMSG_SEND_EVENT(0x02D), // GM client only
    CMSG_DEBUG_AISTATE(0x02E), // development client only
    SMSG_DEBUG_AISTATE(0x02F), // development client only
    CMSG_DISABLE_PVP_CHEAT(0x030), // GM client only
    CMSG_ADVANCE_SPAWN_TIME(0x031), // GM client only
    SMSG_DESTRUCTIBLE_BUILDING_DAMAGE(0x032), // / TODO: implement
    CMSG_AUTH_SRP6_BEGIN(0x033), // not used in client, really?
    CMSG_AUTH_SRP6_PROOF(0x034), // not used in client, really?
    CMSG_AUTH_SRP6_RECODE(0x035), // not used in client, really?
    CMSG_CHAR_CREATE(0x036), // implemented
    CMSG_CHAR_ENUM(0x037), // implemented
    CMSG_CHAR_DELETE(0x038), // implemented
    SMSG_AUTH_SRP6_RESPONSE(0x039), // not used in client, really?
    SMSG_CHAR_CREATE(0x03A), // implemented
    SMSG_CHAR_ENUM(0x03B), // implemented
    SMSG_CHAR_DELETE(0x03C), // implemented
    CMSG_PLAYER_LOGIN(0x03D), // implemented
    SMSG_NEW_WORLD(0x03E), // implemented
    SMSG_TRANSFER_PENDING(0x03F), // implemented
    SMSG_TRANSFER_ABORTED(0x040), // implemented
    SMSG_CHARACTER_LOGIN_FAILED(0x041), // implemented
    SMSG_LOGIN_SETTIMESPEED(0x042), // implemented
    SMSG_GAMETIME_UPDATE(0x043), // / TODO: implement
    CMSG_GAMETIME_SET(0x044), // not used in client
    SMSG_GAMETIME_SET(0x045), // / TODO: implement
    CMSG_GAMESPEED_SET(0x046), // not used in client
    SMSG_GAMESPEED_SET(0x047), // / TODO: implement
    CMSG_SERVERTIME(0x048), // not used in client
    SMSG_SERVERTIME(0x049), // / TODO: implement
    CMSG_PLAYER_LOGOUT(0x04A), // implemented
    CMSG_LOGOUT_REQUEST(0x04B), // implemented
    SMSG_LOGOUT_RESPONSE(0x04C), // implemented
    SMSG_LOGOUT_COMPLETE(0x04D), // implemented
    CMSG_LOGOUT_CANCEL(0x04E), // implemented
    SMSG_LOGOUT_CANCEL_ACK(0x04F), // implemented
    CMSG_NAME_QUERY(0x050), // implemented
    SMSG_NAME_QUERY_RESPONSE(0x051), // implemented
    CMSG_PET_NAME_QUERY(0x052), // implemented
    SMSG_PET_NAME_QUERY_RESPONSE(0x053), // implemented
    CMSG_GUILD_QUERY(0x054), // implemented
    SMSG_GUILD_QUERY_RESPONSE(0x055), // implemented
    CMSG_ITEM_QUERY_SINGLE(0x056), // implemented
    CMSG_ITEM_QUERY_MULTIPLE(0x057), // not used in client
    SMSG_ITEM_QUERY_SINGLE_RESPONSE(0x058), // implemented
    SMSG_ITEM_QUERY_MULTIPLE_RESPONSE(0x059), // / (TODO: implement)
    CMSG_PAGE_TEXT_QUERY(0x05A), // implemented
    SMSG_PAGE_TEXT_QUERY_RESPONSE(0x05B), // implemented
    CMSG_QUEST_QUERY(0x05C), // implemented
    SMSG_QUEST_QUERY_RESPONSE(0x05D), // implemented
    CMSG_GAMEOBJECT_QUERY(0x05E), // implemented
    SMSG_GAMEOBJECT_QUERY_RESPONSE(0x05F), // implemented
    CMSG_CREATURE_QUERY(0x060), // implemented
    SMSG_CREATURE_QUERY_RESPONSE(0x061), // implemented
    CMSG_WHO(0x062), // implemented
    SMSG_WHO(0x063), // implemented
    CMSG_WHOIS(0x064), // / TODO: implement
    SMSG_WHOIS(0x065), // / TODO: implement
    CMSG_CONTACT_LIST(0x066), // implemented
    SMSG_CONTACT_LIST(0x067), // implemented
    SMSG_FRIEND_STATUS(0x068), // implemented
    CMSG_ADD_FRIEND(0x069), // implemented
    CMSG_DEL_FRIEND(0x06A), // implemented
    CMSG_SET_CONTACT_NOTES(0x06B), // implemented (Commented in WorldSession.cpp, why ?)
    CMSG_ADD_IGNORE(0x06C), // implemented
    CMSG_DEL_IGNORE(0x06D), // implemented
    CMSG_GROUP_INVITE(0x06E), // implemented
    SMSG_GROUP_INVITE(0x06F), // implemented
    CMSG_GROUP_CANCEL(0x070), // implemented
    SMSG_GROUP_CANCEL(0x071), // / TODO: implement
    CMSG_GROUP_ACCEPT(0x072), // implemented
    CMSG_GROUP_DECLINE(0x073), // implemented
    SMSG_GROUP_DECLINE(0x074), // implemented
    CMSG_GROUP_UNINVITE(0x075), // implemented
    CMSG_GROUP_UNINVITE_GUID(0x076), // implemented
    SMSG_GROUP_UNINVITE(0x077), // implemented
    CMSG_GROUP_SET_LEADER(0x078), // implemented
    SMSG_GROUP_SET_LEADER(0x079), // implemented
    CMSG_LOOT_METHOD(0x07A), // implemented
    CMSG_GROUP_DISBAND(0x07B), // implemented
    SMSG_GROUP_DESTROYED(0x07C), // implemented
    SMSG_GROUP_LIST(0x07D), // implemented
    SMSG_PARTY_MEMBER_STATS(0x07E), // implemented
    SMSG_PARTY_COMMAND_RESULT(0x07F), // implemented
    UMSG_UPDATE_GROUP_MEMBERS(0x080), // not used in client
    CMSG_GUILD_CREATE(0x081), // implemented
    CMSG_GUILD_INVITE(0x082), // implemented
    SMSG_GUILD_INVITE(0x083), // implemented
    CMSG_GUILD_ACCEPT(0x084), // implemented
    CMSG_GUILD_DECLINE(0x085), // implemented
    SMSG_GUILD_DECLINE(0x086), // implemented
    CMSG_GUILD_INFO(0x087), // implemented
    SMSG_GUILD_INFO(0x088), // implemented
    CMSG_GUILD_ROSTER(0x089), // implemented
    SMSG_GUILD_ROSTER(0x08A), // implemented
    CMSG_GUILD_PROMOTE(0x08B), // implemented
    CMSG_GUILD_DEMOTE(0x08C), // implemented
    CMSG_GUILD_LEAVE(0x08D), // implemented
    CMSG_GUILD_REMOVE(0x08E), // implemented
    CMSG_GUILD_DISBAND(0x08F), // implemented
    CMSG_GUILD_LEADER(0x090), // implemented
    CMSG_GUILD_MOTD(0x091), // implemented
    SMSG_GUILD_EVENT(0x092), // implemented
    SMSG_GUILD_COMMAND_RESULT(0x093), // implemented
    UMSG_UPDATE_GUILD(0x094), // not used in client
    CMSG_MESSAGECHAT(0x095), // implemented
    SMSG_MESSAGECHAT(0x096), // implemented
    CMSG_JOIN_CHANNEL(0x097), // implemented
    CMSG_LEAVE_CHANNEL(0x098), // implemented
    SMSG_CHANNEL_NOTIFY(0x099), // implemented
    CMSG_CHANNEL_LIST(0x09A), // implemented
    SMSG_CHANNEL_LIST(0x09B), // implemented
    CMSG_CHANNEL_PASSWORD(0x09C), // implemented
    CMSG_CHANNEL_SET_OWNER(0x09D), // implemented
    CMSG_CHANNEL_OWNER(0x09E), // implemented
    CMSG_CHANNEL_MODERATOR(0x09F), // implemented
    CMSG_CHANNEL_UNMODERATOR(0x0A0), // implemented
    CMSG_CHANNEL_MUTE(0x0A1), // implemented
    CMSG_CHANNEL_UNMUTE(0x0A2), // implemented
    CMSG_CHANNEL_INVITE(0x0A3), // implemented
    CMSG_CHANNEL_KICK(0x0A4), // implemented
    CMSG_CHANNEL_BAN(0x0A5), // implemented
    CMSG_CHANNEL_UNBAN(0x0A6), // implemented
    CMSG_CHANNEL_ANNOUNCEMENTS(0x0A7), // implemented
    CMSG_CHANNEL_MODERATE(0x0A8), // implemented
    SMSG_UPDATE_OBJECT(0x0A9), // implemented
    SMSG_DESTROY_OBJECT(0x0AA), // implemented
    CMSG_USE_ITEM(0x0AB), // implemented
    CMSG_OPEN_ITEM(0x0AC), // implemented
    CMSG_READ_ITEM(0x0AD), // implemented
    SMSG_READ_ITEM_OK(0x0AE), // implemented
    SMSG_READ_ITEM_FAILED(0x0AF), // implemented
    SMSG_ITEM_COOLDOWN(0x0B0), // / TODO: implement
    CMSG_GAMEOBJ_USE(0x0B1), // implemented
    CMSG_DESTROY_ITEMS(0x0B2), // GM client only
    SMSG_GAMEOBJECT_CUSTOM_ANIM(0x0B3), // implemented
    CMSG_AREATRIGGER(0x0B4), // implemented
    MSG_MOVE_START_FORWARD(0x0B5), // implemented
    MSG_MOVE_START_BACKWARD(0x0B6), // implemented
    MSG_MOVE_STOP(0x0B7), // implemented
    MSG_MOVE_START_STRAFE_LEFT(0x0B8), // implemented
    MSG_MOVE_START_STRAFE_RIGHT(0x0B9), // implemented
    MSG_MOVE_STOP_STRAFE(0x0BA), // implemented
    MSG_MOVE_JUMP(0x0BB), // implemented
    MSG_MOVE_START_TURN_LEFT(0x0BC), // implemented
    MSG_MOVE_START_TURN_RIGHT(0x0BD), // implemented
    MSG_MOVE_STOP_TURN(0x0BE), // implemented
    MSG_MOVE_START_PITCH_UP(0x0BF), // implemented
    MSG_MOVE_START_PITCH_DOWN(0x0C0), // implemented
    MSG_MOVE_STOP_PITCH(0x0C1), // implemented
    MSG_MOVE_SET_RUN_MODE(0x0C2), // implemented
    MSG_MOVE_SET_WALK_MODE(0x0C3), // implemented
    MSG_MOVE_TOGGLE_LOGGING(0x0C4), // not used in client
    MSG_MOVE_TELEPORT(0x0C5), // / TODO: investigate
    MSG_MOVE_TELEPORT_CHEAT(0x0C6), // implemented
    MSG_MOVE_TELEPORT_ACK(0x0C7), // implemented
    MSG_MOVE_TOGGLE_FALL_LOGGING(0x0C8), // not used in client
    MSG_MOVE_FALL_LAND(0x0C9), // implemented
    MSG_MOVE_START_SWIM(0x0CA), // implemented
    MSG_MOVE_STOP_SWIM(0x0CB), // implemented
    MSG_MOVE_SET_RUN_SPEED_CHEAT(0x0CC), // / TODO: investigate
    MSG_MOVE_SET_RUN_SPEED(0x0CD), // / TODO: investigate
    MSG_MOVE_SET_RUN_BACK_SPEED_CHEAT(0x0CE), // / TODO: investigate
    MSG_MOVE_SET_RUN_BACK_SPEED(0x0CF), // / TODO: investigate
    MSG_MOVE_SET_WALK_SPEED_CHEAT(0x0D0), // / TODO: investigate
    MSG_MOVE_SET_WALK_SPEED(0x0D1), // / TODO: investigate
    MSG_MOVE_SET_SWIM_SPEED_CHEAT(0x0D2), // / TODO: investigate
    MSG_MOVE_SET_SWIM_SPEED(0x0D3), // / TODO: investigate
    MSG_MOVE_SET_SWIM_BACK_SPEED_CHEAT(0x0D4), // / TODO: investigate
    MSG_MOVE_SET_SWIM_BACK_SPEED(0x0D5), // / TODO: investigate
    MSG_MOVE_SET_ALL_SPEED_CHEAT(0x0D6), // / TODO: investigate
    MSG_MOVE_SET_TURN_RATE_CHEAT(0x0D7), // / TODO: investigate
    MSG_MOVE_SET_TURN_RATE(0x0D8), // / TODO: investigate
    MSG_MOVE_TOGGLE_COLLISION_CHEAT(0x0D9), // / TODO: investigate
    MSG_MOVE_SET_FACING(0x0DA), // implemented
    MSG_MOVE_SET_PITCH(0x0DB), // implemented
    MSG_MOVE_WORLDPORT_ACK(0x0DC), // implemented
    SMSG_MONSTER_MOVE(0x0DD), // implemented
    SMSG_MOVE_WATER_WALK(0x0DE), // implemented
    SMSG_MOVE_LAND_WALK(0x0DF), // implemented
    MSG_MOVE_SET_RAW_POSITION_ACK(0x0E0), // not used in client
    CMSG_MOVE_SET_RAW_POSITION(0x0E1), // / TODO: implement
    SMSG_FORCE_RUN_SPEED_CHANGE(0x0E2), // implemented
    CMSG_FORCE_RUN_SPEED_CHANGE_ACK(0x0E3), // implemented
    SMSG_FORCE_RUN_BACK_SPEED_CHANGE(0x0E4), // implemented
    CMSG_FORCE_RUN_BACK_SPEED_CHANGE_ACK(0x0E5), // implemented
    SMSG_FORCE_SWIM_SPEED_CHANGE(0x0E6), // implemented
    CMSG_FORCE_SWIM_SPEED_CHANGE_ACK(0x0E7), // implemented
    SMSG_FORCE_MOVE_ROOT(0x0E8), // implemented
    CMSG_FORCE_MOVE_ROOT_ACK(0x0E9), // implemented
    SMSG_FORCE_MOVE_UNROOT(0x0EA), // implemented
    CMSG_FORCE_MOVE_UNROOT_ACK(0x0EB), // implemented
    MSG_MOVE_ROOT(0x0EC), // / TODO: investigate
    MSG_MOVE_UNROOT(0x0ED), // / TODO: investigate
    MSG_MOVE_HEARTBEAT(0x0EE), // implemented
    SMSG_MOVE_KNOCK_BACK(0x0EF), // implemented
    CMSG_MOVE_KNOCK_BACK_ACK(0x0F0), // implemented
    MSG_MOVE_KNOCK_BACK(0x0F1), // / TODO: implement
    SMSG_MOVE_FEATHER_FALL(0x0F2), // implemented
    SMSG_MOVE_NORMAL_FALL(0x0F3), // implemented
    SMSG_MOVE_SET_HOVER(0x0F4), // implemented
    SMSG_MOVE_UNSET_HOVER(0x0F5), // implemented
    CMSG_MOVE_HOVER_ACK(0x0F6), // implemented
    MSG_MOVE_HOVER(0x0F7), // / TODO: investigate, implement
    CMSG_TRIGGER_CINEMATIC_CHEAT(0x0F8), // GM client only
    CMSG_OPENING_CINEMATIC(0x0F9), // / TODO: implement
    SMSG_TRIGGER_CINEMATIC(0x0FA), // implemented
    CMSG_NEXT_CINEMATIC_CAMERA(0x0FB), // / TODO: implement
    CMSG_COMPLETE_CINEMATIC(0x0FC), // implemented
    SMSG_TUTORIAL_FLAGS(0x0FD), // implemented
    CMSG_TUTORIAL_FLAG(0x0FE), // implemented
    CMSG_TUTORIAL_CLEAR(0x0FF), // implemented
    CMSG_TUTORIAL_RESET(0x100), // implemented
    CMSG_STANDSTATECHANGE(0x101), // implemented
    CMSG_EMOTE(0x102), // implemented
    SMSG_EMOTE(0x103), // implemented
    CMSG_TEXT_EMOTE(0x104), // implemented
    SMSG_TEXT_EMOTE(0x105), // implemented
    CMSG_AUTOEQUIP_GROUND_ITEM(0x106), // not used in client
    CMSG_AUTOSTORE_GROUND_ITEM(0x107), // / TODO: implement
    CMSG_AUTOSTORE_LOOT_ITEM(0x108), // implemented
    CMSG_STORE_LOOT_IN_SLOT(0x109), // / TODO: implement
    CMSG_AUTOEQUIP_ITEM(0x10A), // implemented
    CMSG_AUTOSTORE_BAG_ITEM(0x10B), // implemented
    CMSG_SWAP_ITEM(0x10C), // implemented
    CMSG_SWAP_INV_ITEM(0x10D), // implemented
    CMSG_SPLIT_ITEM(0x10E), // implemented
    CMSG_AUTOEQUIP_ITEM_SLOT(0x10F), // implemented
    OBSOLETE_DROP_ITEM(0x110), // not used in client
    CMSG_DESTROYITEM(0x111), // implemented
    SMSG_INVENTORY_CHANGE_FAILURE(0x112), // implemented
    SMSG_OPEN_CONTAINER(0x113), // / TODO: implement
    CMSG_INSPECT(0x114), // implemented
    SMSG_INSPECT(0x115), // handled by client, but unused. Oo
    CMSG_INITIATE_TRADE(0x116), // implemented
    CMSG_BEGIN_TRADE(0x117), // implemented
    CMSG_BUSY_TRADE(0x118), // implemented
    CMSG_IGNORE_TRADE(0x119), // implemented
    CMSG_ACCEPT_TRADE(0x11A), // implemented
    CMSG_UNACCEPT_TRADE(0x11B), // implemented
    CMSG_CANCEL_TRADE(0x11C), // implemented
    CMSG_SET_TRADE_ITEM(0x11D), // implemented
    CMSG_CLEAR_TRADE_ITEM(0x11E), // implemented
    CMSG_SET_TRADE_GOLD(0x11F), // implemented
    SMSG_TRADE_STATUS(0x120), // implemented
    SMSG_TRADE_STATUS_EXTENDED(0x121), // implemented
    SMSG_INITIALIZE_FACTIONS(0x122), // implemented
    SMSG_SET_FACTION_VISIBLE(0x123), // implemented
    SMSG_SET_FACTION_STANDING(0x124), // implemented
    CMSG_SET_FACTION_ATWAR(0x125), // implemented
    CMSG_SET_FACTION_CHEAT(0x126), // not used in client
    SMSG_SET_PROFICIENCY(0x127), // implemented
    CMSG_SET_ACTION_BUTTON(0x128), // implemented
    SMSG_ACTION_BUTTONS(0x129), // implemented
    SMSG_INITIAL_SPELLS(0x12A), // implemented
    SMSG_LEARNED_SPELL(0x12B), // implemented
    SMSG_SUPERCEDED_SPELL(0x12C), // implemented
    CMSG_NEW_SPELL_SLOT(0x12D), // not used in client
    CMSG_CAST_SPELL(0x12E), // implemented
    CMSG_CANCEL_CAST(0x12F), // implemented
    SMSG_CAST_FAILED(0x130), // implemented
    SMSG_SPELL_START(0x131), // implemented
    SMSG_SPELL_GO(0x132), // implemented
    SMSG_SPELL_FAILURE(0x133), // implemented
    SMSG_SPELL_COOLDOWN(0x134), // implemented
    SMSG_COOLDOWN_EVENT(0x135), // implemented
    CMSG_CANCEL_AURA(0x136), // implemented
    SMSG_EQUIPMENT_SET_SAVED(0x137), // not used in client
    SMSG_PET_CAST_FAILED(0x138), // implemented
    MSG_CHANNEL_START(0x139), // implemented
    MSG_CHANNEL_UPDATE(0x13A), // implemented
    CMSG_CANCEL_CHANNELLING(0x13B), // implemented
    SMSG_AI_REACTION(0x13C), // implemented
    CMSG_SET_SELECTION(0x13D), // implemented
    CMSG_EQUIPMENT_SET_DELETE(0x13E), // not used in client
    CMSG_UNUSED(0x13F), // not used in client
    CMSG_UNUSED2(0x140), // not used in client
    CMSG_ATTACKSWING(0x141), // implemented
    CMSG_ATTACKSTOP(0x142), // implemented
    SMSG_ATTACKSTART(0x143), // implemented
    SMSG_ATTACKSTOP(0x144), // implemented
    SMSG_ATTACKSWING_NOTINRANGE(0x145), // implemented
    SMSG_ATTACKSWING_BADFACING(0x146), // implemented
    SMSG_ATTACKSWING_NOTSTANDING(0x147), // not used in client
    SMSG_ATTACKSWING_DEADTARGET(0x148), // / TODO: implement
    SMSG_ATTACKSWING_CANT_ATTACK(0x149), // / TODO: implement
    SMSG_ATTACKERSTATEUPDATE(0x14A), // implemented
    SMSG_VICTIMSTATEUPDATE_OBSOLETE(0x14B), // not used in client
    SMSG_DAMAGE_DONE_OBSOLETE(0x14C), // not used in client
    SMSG_DAMAGE_TAKEN_OBSOLETE(0x14D), // not used in client
    SMSG_CANCEL_COMBAT(0x14E), // implemented
    SMSG_SPELLBREAKLOG(0x14F), // / TODO: implement, same struct as SMSG_SPELLDISMISSLOG
    SMSG_SPELLHEALLOG(0x150), // implemented
    SMSG_SPELLENERGIZELOG(0x151), // implemented
    SMSG_BREAK_TARGET(0x152), // / TODO: implement. was CMSG_SHEATHE_OBSOLETE in your enum.
    CMSG_SAVE_PLAYER(0x153), // GM client only
    CMSG_SETDEATHBINDPOINT(0x154), // GM client only
    SMSG_BINDPOINTUPDATE(0x155), // implemented
    CMSG_GETDEATHBINDZONE(0x156), // GM client only
    SMSG_BINDZONEREPLY(0x157), // handled by client, but unused. Oo
    SMSG_PLAYERBOUND(0x158), // implemented
    SMSG_CLIENT_CONTROL_UPDATE(0x159), // implemented
    CMSG_REPOP_REQUEST(0x15A), // implemented
    SMSG_RESURRECT_REQUEST(0x15B), // implemented
    CMSG_RESURRECT_RESPONSE(0x15C), // implemented
    CMSG_LOOT(0x15D), // implemented
    CMSG_LOOT_MONEY(0x15E), // implemented
    CMSG_LOOT_RELEASE(0x15F), // implemented
    SMSG_LOOT_RESPONSE(0x160), // implemented
    SMSG_LOOT_RELEASE_RESPONSE(0x161), // implemented
    SMSG_LOOT_REMOVED(0x162), // implemented
    SMSG_LOOT_MONEY_NOTIFY(0x163), // implemented
    SMSG_LOOT_ITEM_NOTIFY(0x164), // / TODO: maybe implement. handled by client, but unused. Oo
    SMSG_LOOT_CLEAR_MONEY(0x165), // implemented
    SMSG_ITEM_PUSH_RESULT(0x166), // implemented
    SMSG_DUEL_REQUESTED(0x167), // implemented
    SMSG_DUEL_OUTOFBOUNDS(0x168), // implemented
    SMSG_DUEL_INBOUNDS(0x169), // implemented
    SMSG_DUEL_COMPLETE(0x16A), // implemented
    SMSG_DUEL_WINNER(0x16B), // implemented
    CMSG_DUEL_ACCEPTED(0x16C), // implemented
    CMSG_DUEL_CANCELLED(0x16D), // implemented
    SMSG_MOUNTRESULT(0x16E), // / TODO: implement
    SMSG_DISMOUNTRESULT(0x16F), // / TODO: implement
    SMSG_PUREMOUNT_CANCELLED_OBSOLETE(0x170), // not used in client
    CMSG_MOUNTSPECIAL_ANIM(0x171), // implemented
    SMSG_MOUNTSPECIAL_ANIM(0x172), // implemented
    SMSG_PET_TAME_FAILURE(0x173), // implemented
    CMSG_PET_SET_ACTION(0x174), // implemented
    CMSG_PET_ACTION(0x175), // implemented
    CMSG_PET_ABANDON(0x176), // implemented
    CMSG_PET_RENAME(0x177), // implemented
    SMSG_PET_NAME_INVALID(0x178), // / TODO: implement
    SMSG_PET_SPELLS(0x179), // implemented
    SMSG_PET_MODE(0x17A), // / TODO: implement
    CMSG_GOSSIP_HELLO(0x17B), // implemented
    CMSG_GOSSIP_SELECT_OPTION(0x17C), // implemented
    SMSG_GOSSIP_MESSAGE(0x17D), // implemented
    SMSG_GOSSIP_COMPLETE(0x17E), // implemented
    CMSG_NPC_TEXT_QUERY(0x17F), // implemented
    SMSG_NPC_TEXT_UPDATE(0x180), // implemented
    SMSG_NPC_WONT_TALK(0x181), // not used in client
    CMSG_QUESTGIVER_STATUS_QUERY(0x182), // implemented
    SMSG_QUESTGIVER_STATUS(0x183), // implemented
    CMSG_QUESTGIVER_HELLO(0x184), // implemented
    SMSG_QUESTGIVER_QUEST_LIST(0x185), // implemented
    CMSG_QUESTGIVER_QUERY_QUEST(0x186), // implemented
    CMSG_QUESTGIVER_QUEST_AUTOLAUNCH(0x187), // not used in client
    SMSG_QUESTGIVER_QUEST_DETAILS(0x188), // implemented
    CMSG_QUESTGIVER_ACCEPT_QUEST(0x189), // implemented
    CMSG_QUESTGIVER_COMPLETE_QUEST(0x18A), // implemented
    SMSG_QUESTGIVER_REQUEST_ITEMS(0x18B), // implemented
    CMSG_QUESTGIVER_REQUEST_REWARD(0x18C), // implemented
    SMSG_QUESTGIVER_OFFER_REWARD(0x18D), // implemented
    CMSG_QUESTGIVER_CHOOSE_REWARD(0x18E), // implemented
    SMSG_QUESTGIVER_QUEST_INVALID(0x18F), // implemented
    CMSG_QUESTGIVER_CANCEL(0x190), // implemented
    SMSG_QUESTGIVER_QUEST_COMPLETE(0x191), // implemented
    SMSG_QUESTGIVER_QUEST_FAILED(0x192), // implemented
    CMSG_QUESTLOG_SWAP_QUEST(0x193), // not used in client
    CMSG_QUESTLOG_REMOVE_QUEST(0x194), // implemented
    SMSG_QUESTLOG_FULL(0x195), // implemented
    SMSG_QUESTUPDATE_FAILED(0x196), // implemented
    SMSG_QUESTUPDATE_FAILEDTIMER(0x197), // implemented
    SMSG_QUESTUPDATE_COMPLETE(0x198), // implemented
    SMSG_QUESTUPDATE_ADD_KILL(0x199), // implemented
    SMSG_QUESTUPDATE_ADD_ITEM(0x19A), // implemented
    CMSG_QUEST_CONFIRM_ACCEPT(0x19B), // / TODO: implement
    SMSG_QUEST_CONFIRM_ACCEPT(0x19C), // / TODO: implement
    CMSG_PUSHQUESTTOPARTY(0x19D), // implemented
    CMSG_LIST_INVENTORY(0x19E), // implemented
    SMSG_LIST_INVENTORY(0x19F), // implemented
    CMSG_SELL_ITEM(0x1A0), // implemented
    SMSG_SELL_ITEM(0x1A1), // implemented
    CMSG_BUY_ITEM(0x1A2), // implemented
    CMSG_BUY_ITEM_IN_SLOT(0x1A3), // implemented
    SMSG_BUY_ITEM(0x1A4), // implemented
    SMSG_BUY_FAILED(0x1A5), // implemented
    CMSG_TAXICLEARALLNODES(0x1A6), // GM client only
    CMSG_TAXIENABLEALLNODES(0x1A7), // GM client only
    CMSG_TAXISHOWNODES(0x1A8), // GM client only
    SMSG_SHOWTAXINODES(0x1A9), // implemented
    CMSG_TAXINODE_STATUS_QUERY(0x1AA), // implemented
    SMSG_TAXINODE_STATUS(0x1AB), // implemented
    CMSG_TAXIQUERYAVAILABLENODES(0x1AC), // implemented
    CMSG_ACTIVATETAXI(0x1AD), // implemented
    SMSG_ACTIVATETAXIREPLY(0x1AE), // implemented
    SMSG_NEW_TAXI_PATH(0x1AF), // implemented
    CMSG_TRAINER_LIST(0x1B0), // implemented
    SMSG_TRAINER_LIST(0x1B1), // implemented
    CMSG_TRAINER_BUY_SPELL(0x1B2), // implemented
    SMSG_TRAINER_BUY_SUCCEEDED(0x1B3), // not used in client
    SMSG_TRAINER_BUY_FAILED(0x1B4), // / TODO: implement
    CMSG_BINDER_ACTIVATE(0x1B5), // implemented
    SMSG_PLAYERBINDERROR(0x1B6), // / TODO: implement
    CMSG_BANKER_ACTIVATE(0x1B7), // implemented
    SMSG_SHOW_BANK(0x1B8), // implemented
    CMSG_BUY_BANK_SLOT(0x1B9), // implemented
    SMSG_BUY_BANK_SLOT_RESULT(0x1BA), // implemented
    CMSG_PETITION_SHOWLIST(0x1BB), // implemented
    SMSG_PETITION_SHOWLIST(0x1BC), // implemented
    CMSG_PETITION_BUY(0x1BD), // implemented
    CMSG_PETITION_SHOW_SIGNATURES(0x1BE), // implemented
    SMSG_PETITION_SHOW_SIGNATURES(0x1BF), // implemented
    CMSG_PETITION_SIGN(0x1C0), // implemented
    SMSG_PETITION_SIGN_RESULTS(0x1C1), // implemented
    MSG_PETITION_DECLINE(0x1C2), // implemented
    CMSG_OFFER_PETITION(0x1C3), // implemented
    CMSG_TURN_IN_PETITION(0x1C4), // implemented
    SMSG_TURN_IN_PETITION_RESULTS(0x1C5), // implemented
    CMSG_PETITION_QUERY(0x1C6), // implemented
    SMSG_PETITION_QUERY_RESPONSE(0x1C7), // implemented
    SMSG_FISH_NOT_HOOKED(0x1C8), // implemented
    SMSG_FISH_ESCAPED(0x1C9), // implemented
    CMSG_BUG(0x1CA), // implemented
    SMSG_NOTIFICATION(0x1CB), // implemented
    CMSG_PLAYED_TIME(0x1CC), // implemented
    SMSG_PLAYED_TIME(0x1CD), // implemented
    CMSG_QUERY_TIME(0x1CE), // implemented
    SMSG_QUERY_TIME_RESPONSE(0x1CF), // implemented
    SMSG_LOG_XPGAIN(0x1D0), // implemented
    SMSG_AURACASTLOG_OBSOLETE(0x1D1), // OBSOLETE
    CMSG_RECLAIM_CORPSE(0x1D2), // implemented
    CMSG_WRAP_ITEM(0x1D3), // implemented
    SMSG_LEVELUP_INFO(0x1D4), // implemented
    MSG_MINIMAP_PING(0x1D5), // implemented
    SMSG_RESISTLOG(0x1D6), // not used in client
    SMSG_ENCHANTMENTLOG(0x1D7), // implemented
    CMSG_SET_SKILL_CHEAT(0x1D8), // GM client only
    SMSG_START_MIRROR_TIMER(0x1D9), // implemented
    SMSG_PAUSE_MIRROR_TIMER(0x1DA), // / TODO: implement
    SMSG_STOP_MIRROR_TIMER(0x1DB), // implemented
    CMSG_PING(0x1DC), // implemented
    SMSG_PONG(0x1DD), // implemented
    SMSG_CLEAR_COOLDOWN(0x1DE), // implemented
    SMSG_GAMEOBJECT_PAGETEXT(0x1DF), // implemented
    CMSG_SETSHEATHED(0x1E0), // implemented
    SMSG_COOLDOWN_CHEAT(0x1E1), // / TODO: implement
    SMSG_SPELL_DELAYED(0x1E2), // implemented
    CMSG_QUEST_POI_QUERY(0x1E3),
    SMSG_QUEST_POI_QUERY_RESPONSE(0x1E4),
    CMSG_GHOST(0x1E5), // GM client only
    CMSG_GM_INVIS(0x1E6), // GM client only
    SMSG_INVALID_PROMOTION_CODE(0x1E7), // / TODO: implement
    MSG_GM_BIND_OTHER(0x1E8), // GM client only
    MSG_GM_SUMMON(0x1E9), // GM client only
    SMSG_ITEM_TIME_UPDATE(0x1EA), // / TODO: implement
    SMSG_ITEM_ENCHANT_TIME_UPDATE(0x1EB), // implemented
    SMSG_AUTH_CHALLENGE(0x1EC), // implemented
    CMSG_AUTH_SESSION(0x1ED), // implemented
    SMSG_AUTH_RESPONSE(0x1EE), // implemented
    MSG_GM_SHOWLABEL(0x1EF), // GM client only
    CMSG_PET_CAST_SPELL(0x1F0), // implemented
    MSG_SAVE_GUILD_EMBLEM(0x1F1), // implemented
    MSG_TABARDVENDOR_ACTIVATE(0x1F2), // implemented
    SMSG_PLAY_SPELL_VISUAL(0x1F3), // implemented
    CMSG_ZONEUPDATE(0x1F4), // implemented
    SMSG_PARTYKILLLOG(0x1F5), // implemented
    SMSG_COMPRESSED_UPDATE_OBJECT(0x1F6), // implemented
    SMSG_PLAY_SPELL_IMPACT(0x1F7), // implemented
    SMSG_EXPLORATION_EXPERIENCE(0x1F8), // implemented
    CMSG_GM_SET_SECURITY_GROUP(0x1F9), // GM client only
    CMSG_GM_NUKE(0x1FA), // GM client only
    MSG_RANDOM_ROLL(0x1FB), // implemented
    SMSG_ENVIRONMENTALDAMAGELOG(0x1FC), // implemented
    CMSG_RWHOIS_OBSOLETE(0x1FD), // not used in client
    SMSG_RWHOIS(0x1FE), // / TODO: maybe implement as response to a chatcommand.
    MSG_LOOKING_FOR_GROUP(0x1FF), // implemented
    CMSG_SET_LOOKING_FOR_GROUP(0x200), // implemented
    CMSG_UNLEARN_SPELL(0x201), // GM client only
    CMSG_UNLEARN_SKILL(0x202), // implemented
    SMSG_REMOVED_SPELL(0x203), // implemented
    CMSG_DECHARGE(0x204), // not used in client
    CMSG_GMTICKET_CREATE(0x205), // implemented
    SMSG_GMTICKET_CREATE(0x206), // implemented
    CMSG_GMTICKET_UPDATETEXT(0x207), // implemented
    SMSG_GMTICKET_UPDATETEXT(0x208), // implemented
    SMSG_ACCOUNT_DATA_TIMES(0x209), // implemented
    CMSG_REQUEST_ACCOUNT_DATA(0x20A), // implemented
    CMSG_UPDATE_ACCOUNT_DATA(0x20B), // implemented
    SMSG_UPDATE_ACCOUNT_DATA(0x20C), // implemented
    SMSG_CLEAR_FAR_SIGHT_IMMEDIATE(0x20D), // / TODO: implement
    SMSG_POWERGAINLOG_OBSOLETE(0x20E), // not used in client
    CMSG_GM_TEACH(0x20F), // GM client only
    CMSG_GM_CREATE_ITEM_TARGET(0x210), // GM client only
    CMSG_GMTICKET_GETTICKET(0x211), // implemented
    SMSG_GMTICKET_GETTICKET(0x212), // implemented
    CMSG_UNLEARN_TALENTS(0x213), // implemented
    SMSG_GAMEOBJECT_SPAWN_ANIM_OBSOLETE(0x214), // not used in client
    SMSG_GAMEOBJECT_DESPAWN_ANIM(0x215), // / cannot find this in client. obsolete? its implemented.
    MSG_CORPSE_QUERY(0x216), // implemented
    CMSG_GMTICKET_DELETETICKET(0x217), // implemented
    SMSG_GMTICKET_DELETETICKET(0x218), // implemented
    SMSG_CHAT_WRONG_FACTION(0x219), // / TODO: implement
    CMSG_GMTICKET_SYSTEMSTATUS(0x21A), // implemented
    SMSG_GMTICKET_SYSTEMSTATUS(0x21B), // implemented
    CMSG_SPIRIT_HEALER_ACTIVATE(0x21C), // implemented
    CMSG_SET_STAT_CHEAT(0x21D), // GM client only
    SMSG_SET_REST_START_OBSOLETE(0x21E), // not used in client
    CMSG_SKILL_BUY_STEP(0x21F), // / TODO: implement
    CMSG_SKILL_BUY_RANK(0x220), // / TODO: implement
    CMSG_XP_CHEAT(0x221), // GM client only
    SMSG_SPIRIT_HEALER_CONFIRM(0x222), // implemented
    CMSG_CHARACTER_POINT_CHEAT(0x223), // GM client only
    SMSG_GOSSIP_POI(0x224), // implemented
    CMSG_CHAT_IGNORED(0x225), // implemented
    CMSG_GM_VISION(0x226), // GM client only
    CMSG_SERVER_COMMAND(0x227), // GM client only
    CMSG_GM_SILENCE(0x228), // GM client only
    CMSG_GM_REVEALTO(0x229), // GM client only
    CMSG_GM_RESURRECT(0x22A), // GM client only
    CMSG_GM_SUMMONMOB(0x22B), // GM client only
    CMSG_GM_MOVECORPSE(0x22C), // GM client only
    CMSG_GM_FREEZE(0x22D), // GM client only
    CMSG_GM_UBERINVIS(0x22E), // GM client only
    CMSG_GM_REQUEST_PLAYER_INFO(0x22F), // GM client only. handled and ignored in normal one. seems
                                        // to be a SMSG, not a CMSG.
    SMSG_GM_PLAYER_INFO(0x230), // GM client only. handled and ignored in normal one.
    CMSG_GUILD_RANK(0x231), // implemented
    CMSG_GUILD_ADD_RANK(0x232), // implemented
    CMSG_GUILD_DEL_RANK(0x233), // implemented
    CMSG_GUILD_SET_PUBLIC_NOTE(0x234), // implemented
    CMSG_GUILD_SET_OFFICER_NOTE(0x235), // implemented
    SMSG_LOGIN_VERIFY_WORLD(0x236), // implemented
    CMSG_CLEAR_EXPLORATION(0x237), // GM client only
    CMSG_SEND_MAIL(0x238), // implemented
    SMSG_SEND_MAIL_RESULT(0x239), // implemented
    CMSG_GET_MAIL_LIST(0x23A), // implemented
    SMSG_MAIL_LIST_RESULT(0x23B), // implemented
    CMSG_BATTLEFIELD_LIST(0x23C), // implemented
    SMSG_BATTLEFIELD_LIST(0x23D), // implemented
    CMSG_BATTLEFIELD_JOIN(0x23E), // not used in client
    SMSG_BATTLEFIELD_WIN_OBSOLETE(0x23F), // not used in client
    SMSG_BATTLEFIELD_LOSE_OBSOLETE(0x240), // not used in client
    CMSG_TAXICLEARNODE(0x241), // GM client only
    CMSG_TAXIENABLENODE(0x242), // GM client only
    CMSG_ITEM_TEXT_QUERY(0x243), // implemented
    SMSG_ITEM_TEXT_QUERY_RESPONSE(0x244), // implemented
    CMSG_MAIL_TAKE_MONEY(0x245), // implemented
    CMSG_MAIL_TAKE_ITEM(0x246), // implemented
    CMSG_MAIL_MARK_AS_READ(0x247), // implemented
    CMSG_MAIL_RETURN_TO_SENDER(0x248), // implemented
    CMSG_MAIL_DELETE(0x249), // implemented
    CMSG_MAIL_CREATE_TEXT_ITEM(0x24A), // implemented
    SMSG_SPELLLOGMISS(0x24B), // implemented
    SMSG_SPELLLOGEXECUTE(0x24C), // implemented
    SMSG_DEBUGAURAPROC(0x24D), // not used in client
    SMSG_PERIODICAURALOG(0x24E), // implemented
    SMSG_SPELLDAMAGESHIELD(0x24F), // implemented
    SMSG_SPELLNONMELEEDAMAGELOG(0x250), // implemented
    CMSG_LEARN_TALENT(0x251), // implemented
    SMSG_RESURRECT_FAILED(0x252), // implemented
    CMSG_TOGGLE_PVP(0x253), // implemented
    SMSG_ZONE_UNDER_ATTACK(0x254), // implemented
    MSG_AUCTION_HELLO(0x255), // implemented
    CMSG_AUCTION_SELL_ITEM(0x256), // implemented
    CMSG_AUCTION_REMOVE_ITEM(0x257), // implemented
    CMSG_AUCTION_LIST_ITEMS(0x258), // implemented
    CMSG_AUCTION_LIST_OWNER_ITEMS(0x259), // implemented
    CMSG_AUCTION_PLACE_BID(0x25A), // implemented
    SMSG_AUCTION_COMMAND_RESULT(0x25B), // implemented
    SMSG_AUCTION_LIST_RESULT(0x25C), // implemented
    SMSG_AUCTION_OWNER_LIST_RESULT(0x25D), // implemented
    SMSG_AUCTION_BIDDER_NOTIFICATION(0x25E), // implemented
    SMSG_AUCTION_OWNER_NOTIFICATION(0x25F), // implemented
    SMSG_PROCRESIST(0x260), // / TODO: implement
    SMSG_STANDSTATE_CHANGE_FAILURE_OBSOLETE(0x261), // not used in client
    SMSG_DISPEL_FAILED(0x262), // / TODO: implement
    SMSG_SPELLORDAMAGE_IMMUNE(0x263), // / TODO: implement
    CMSG_AUCTION_LIST_BIDDER_ITEMS(0x264), // implemented
    SMSG_AUCTION_BIDDER_LIST_RESULT(0x265), // implemented
    SMSG_SET_FLAT_SPELL_MODIFIER(0x266), // implemented
    SMSG_SET_PCT_SPELL_MODIFIER(0x267), // implemented
    CMSG_SET_AMMO(0x268), // implemented
    SMSG_CORPSE_RECLAIM_DELAY(0x269), // implemented
    CMSG_SET_ACTIVE_MOVER(0x26A), // implemented
    CMSG_PET_CANCEL_AURA(0x26B), // implemented
    CMSG_PLAYER_AI_CHEAT(0x26C), // GM client only
    CMSG_CANCEL_AUTO_REPEAT_SPELL(0x26D), // implemented
    MSG_GM_ACCOUNT_ONLINE(0x26E), // GM client only
    MSG_LIST_STABLED_PETS(0x26F), // implemented
    CMSG_STABLE_PET(0x270), // implemented
    CMSG_UNSTABLE_PET(0x271), // implemented
    CMSG_BUY_STABLE_SLOT(0x272), // implemented
    SMSG_STABLE_RESULT(0x273), // implemented
    CMSG_STABLE_REVIVE_PET(0x274), // not used in client
    CMSG_STABLE_SWAP_PET(0x275), // implemented
    MSG_QUEST_PUSH_RESULT(0x276), // implemented
    SMSG_PLAY_MUSIC(0x277), // / TODO: implement
    SMSG_PLAY_OBJECT_SOUND(0x278), // implemented
    CMSG_REQUEST_PET_INFO(0x279), // implemented
    CMSG_FAR_SIGHT(0x27A), // / TODO: implement
    SMSG_SPELLDISPELLOG(0x27B), // implemented
    SMSG_DAMAGE_CALC_LOG(0x27C), // / TODO: maybe implement for debugging. : D
    CMSG_ENABLE_DAMAGE_LOG(0x27D), // not used in client
    CMSG_GROUP_CHANGE_SUB_GROUP(0x27E), // implemented
    CMSG_REQUEST_PARTY_MEMBER_STATS(0x27F), // implemented
    CMSG_GROUP_SWAP_SUB_GROUP(0x280), // / TODO: implement
    CMSG_RESET_FACTION_CHEAT(0x281), // GM client only
    CMSG_AUTOSTORE_BANK_ITEM(0x282), // implemented
    CMSG_AUTOBANK_ITEM(0x283), // implemented
    MSG_QUERY_NEXT_MAIL_TIME(0x284), // implemented
    SMSG_RECEIVED_MAIL(0x285), // implemented
    SMSG_RAID_GROUP_ONLY(0x286), // implemented
    CMSG_SET_DURABILITY_CHEAT(0x287), // GM client only
    CMSG_SET_PVP_RANK_CHEAT(0x288), // GM client only
    CMSG_ADD_PVP_MEDAL_CHEAT(0x289), // GM client only
    CMSG_DEL_PVP_MEDAL_CHEAT(0x28A), // GM client only
    CMSG_SET_PVP_TITLE(0x28B), // not used in client
    SMSG_PVP_CREDIT(0x28C), // implemented
    SMSG_AUCTION_REMOVED_NOTIFICATION(0x28D), // / TODO: implement
    CMSG_GROUP_RAID_CONVERT(0x28E), // implemented
    CMSG_GROUP_ASSISTANT_LEADER(0x28F), // implemented
    CMSG_BUYBACK_ITEM(0x290), // implemented
    SMSG_SERVER_MESSAGE(0x291), // implemented
    CMSG_MEETINGSTONE_JOIN(0x292), // not used in client
    CMSG_MEETINGSTONE_LEAVE(0x293), // not used in client
    CMSG_MEETINGSTONE_CHEAT(0x294), // not used in client
    SMSG_MEETINGSTONE_SETQUEUE(0x295), // implemented
    CMSG_MEETINGSTONE_INFO(0x296), // implemented
    SMSG_MEETINGSTONE_COMPLETE(0x297), // / TODO: implement
    SMSG_MEETINGSTONE_IN_PROGRESS(0x298), // / TODO: implement
    SMSG_MEETINGSTONE_MEMBER_ADDED(0x299), // / TODO: implement
    CMSG_GMTICKETSYSTEM_TOGGLE(0x29A), // implemented
    CMSG_CANCEL_GROWTH_AURA(0x29B), // / TODO: implement
    SMSG_CANCEL_AUTO_REPEAT(0x29C), // implemented
    SMSG_STANDSTATE_UPDATE(0x29D), // implemented
    SMSG_LOOT_ALL_PASSED(0x29E), // implemented
    SMSG_LOOT_ROLL_WON(0x29F), // implemented
    CMSG_LOOT_ROLL(0x2A0), // implemented
    SMSG_LOOT_START_ROLL(0x2A1), // implemented
    SMSG_LOOT_ROLL(0x2A2), // implemented
    CMSG_LOOT_MASTER_GIVE(0x2A3), // implemented
    SMSG_LOOT_MASTER_LIST(0x2A4), // implemented
    SMSG_SET_FORCED_REACTIONS(0x2A5), // implemented
    SMSG_SPELL_FAILED_OTHER(0x2A6), // implemented
    SMSG_GAMEOBJECT_RESET_STATE(0x2A7), // / TODO: implement
    CMSG_REPAIR_ITEM(0x2A8), // implemented
    SMSG_CHAT_PLAYER_NOT_FOUND(0x2A9), // implemented
    MSG_TALENT_WIPE_CONFIRM(0x2AA), // implemented
    SMSG_SUMMON_REQUEST(0x2AB), // implemented
    CMSG_SUMMON_RESPONSE(0x2AC), // implemented
    MSG_MOVE_TOGGLE_GRAVITY_CHEAT(0x2AD), // / TODO: investigate
    SMSG_MONSTER_MOVE_TRANSPORT(0x2AE), // / TODO: investigate. this is like the MONSTER_MOVE one,
                                        // handle vehicle and NPC on boat.
    SMSG_PET_BROKEN(0x2AF), // / TODO: implement
    MSG_MOVE_FEATHER_FALL(0x2B0), // / TODO: investigate
    MSG_MOVE_WATER_WALK(0x2B1), // / TODO: investigate
    CMSG_SERVER_BROADCAST(0x2B2), // GM client only
    CMSG_SELF_RES(0x2B3), // implemented
    SMSG_FEIGN_DEATH_RESISTED(0x2B4), // / TODO: implement
    CMSG_RUN_SCRIPT(0x2B5), // GM client only
    SMSG_SCRIPT_MESSAGE(0x2B6), // GM client only
    SMSG_DUEL_COUNTDOWN(0x2B7), // implemented
    SMSG_AREA_TRIGGER_MESSAGE(0x2B8), // implemented
    CMSG_TOGGLE_HELM(0x2B9), // implemented
    CMSG_TOGGLE_CLOAK(0x2BA), // implemented
    SMSG_MEETINGSTONE_JOINFAILED(0x2BB), // / TODO: implement
    SMSG_PLAYER_SKINNED(0x2BC), // implemented
    SMSG_DURABILITY_DAMAGE_DEATH(0x2BD), // implemented
    CMSG_SET_EXPLORATION(0x2BE), // not used in client
    CMSG_SET_ACTIONBAR_TOGGLES(0x2BF), // implemented
    UMSG_DELETE_GUILD_CHARTER(0x2C0), // not used in client
    MSG_PETITION_RENAME(0x2C1), // implemented
    SMSG_INIT_WORLD_STATES(0x2C2), // implemented
    SMSG_UPDATE_WORLD_STATE(0x2C3), // implemented
    CMSG_ITEM_NAME_QUERY(0x2C4), // implemented
    SMSG_ITEM_NAME_QUERY_RESPONSE(0x2C5), // implemented
    SMSG_PET_ACTION_FEEDBACK(0x2C6), // implemented
    CMSG_CHAR_RENAME(0x2C7), // implemented
    SMSG_CHAR_RENAME(0x2C8), // implemented
    CMSG_MOVE_SPLINE_DONE(0x2C9), // implemented
    CMSG_MOVE_FALL_RESET(0x2CA), // / TODO: implement
    SMSG_UPDATE_LAST_INSTANCE_CREATED(0x2CB), // / TODO: implement
    SMSG_RAID_INSTANCE_INFO(0x2CC), // implemented
    CMSG_REQUEST_RAID_INFO(0x2CD), // implemented
    CMSG_MOVE_TIME_SKIPPED(0x2CE), // implemented
    CMSG_MOVE_FEATHER_FALL_ACK(0x2CF), // implemented // implemented
    CMSG_MOVE_WATER_WALK_ACK(0x2D0), // implemented
    CMSG_MOVE_NOT_ACTIVE_MOVER(0x2D1), // implemented
    SMSG_PLAY_SOUND(0x2D2), // implemented
    CMSG_BATTLEFIELD_STATUS(0x2D3), // implemented
    SMSG_BATTLEFIELD_STATUS(0x2D4), // implemented
    CMSG_BATTLEFIELD_PORT(0x2D5), // implemented
    MSG_INSPECT_HONOR_STATS(0x2D6), // implemented
    CMSG_BATTLEMASTER_HELLO(0x2D7), // implemented
    CMSG_MOVE_START_SWIM_CHEAT(0x2D8), // / TODO: investigate
    CMSG_MOVE_STOP_SWIM_CHEAT(0x2D9), // / TODO: investigate
    SMSG_FORCE_WALK_SPEED_CHANGE(0x2DA), // / TODO: investigate
    CMSG_FORCE_WALK_SPEED_CHANGE_ACK(0x2DB), // "implemented"
    SMSG_FORCE_SWIM_BACK_SPEED_CHANGE(0x2DC), // implemented
    CMSG_FORCE_SWIM_BACK_SPEED_CHANGE_ACK(0x2DD), // "implemented"
    SMSG_FORCE_TURN_RATE_CHANGE(0x2DE), // / TODO: investigate
    CMSG_FORCE_TURN_RATE_CHANGE_ACK(0x2DF), // "implemented"
    MSG_PVP_LOG_DATA(0x2E0), // implemented
    CMSG_LEAVE_BATTLEFIELD(0x2E1), // implemented
    CMSG_AREA_SPIRIT_HEALER_QUERY(0x2E2), // implemented
    CMSG_AREA_SPIRIT_HEALER_QUEUE(0x2E3), // implemented
    SMSG_AREA_SPIRIT_HEALER_TIME(0x2E4), // implemented
    CMSG_GM_UNTEACH(0x2E5), // GM client only
    SMSG_WARDEN_DATA(0x2E6), // / (TODO: investigate)
    CMSG_WARDEN_DATA(0x2E7), // / (TODO: investigate)
    SMSG_GROUP_JOINED_BATTLEGROUND(0x2E8), // implemented
    MSG_BATTLEGROUND_PLAYER_POSITIONS(0x2E9), // implemented
    CMSG_PET_STOP_ATTACK(0x2EA), // / TODO: implement
    SMSG_BINDER_CONFIRM(0x2EB), // implemented
    SMSG_BATTLEGROUND_PLAYER_JOINED(0x2EC), // implemented
    SMSG_BATTLEGROUND_PLAYER_LEFT(0x2ED), // implemented
    CMSG_BATTLEMASTER_JOIN(0x2EE), // implemented
    SMSG_ADDON_INFO(0x2EF), // implemented
    CMSG_PET_UNLEARN(0x2F0), // implemented
    SMSG_PET_UNLEARN_CONFIRM(0x2F1), // implemented
    SMSG_PARTY_MEMBER_STATS_FULL(0x2F2), // implemented
    CMSG_PET_SPELL_AUTOCAST(0x2F3), // implemented
    SMSG_WEATHER(0x2F4), // implemented
    SMSG_PLAY_TIME_WARNING(0x2F5), // / TODO: implement (exist only in china).
    SMSG_MINIGAME_SETUP(0x2F6), // / TODO: implement
    SMSG_MINIGAME_STATE(0x2F7), // / TODO: implement
    CMSG_MINIGAME_MOVE(0x2F8), // / TODO: implement
    SMSG_MINIGAME_MOVE_FAILED(0x2F9), // not used in client
    SMSG_RAID_INSTANCE_MESSAGE(0x2FA), // / TODO: implement
    SMSG_COMPRESSED_MOVES(0x2FB), // / (TODO: investigate if you feel like it. i'm too lazy.)
    CMSG_GUILD_INFO_TEXT(0x2FC), // implemented
    SMSG_CHAT_RESTRICTED(0x2FD), // / TODO: implement
    SMSG_SPLINE_SET_RUN_SPEED(0x2FE), // / TODO: investigate
    SMSG_SPLINE_SET_RUN_BACK_SPEED(0x2FF), // / TODO: investigate
    SMSG_SPLINE_SET_SWIM_SPEED(0x300), // / TODO: investigate
    SMSG_SPLINE_SET_WALK_SPEED(0x301), // / TODO: investigate
    SMSG_SPLINE_SET_SWIM_BACK_SPEED(0x302), // / TODO: investigate
    SMSG_SPLINE_SET_TURN_RATE(0x303), // / TODO: investigate
    SMSG_SPLINE_MOVE_UNROOT(0x304), // / TODO: investigate
    SMSG_SPLINE_MOVE_FEATHER_FALL(0x305), // / TODO: investigate
    SMSG_SPLINE_MOVE_NORMAL_FALL(0x306), // / TODO: investigate
    SMSG_SPLINE_MOVE_SET_HOVER(0x307), // / TODO: investigate
    SMSG_SPLINE_MOVE_UNSET_HOVER(0x308), // / TODO: investigate
    SMSG_SPLINE_MOVE_WATER_WALK(0x309), // / TODO: investigate
    SMSG_SPLINE_MOVE_LAND_WALK(0x30A), // / TODO: investigate
    SMSG_SPLINE_MOVE_START_SWIM(0x30B), // / TODO: investigate
    SMSG_SPLINE_MOVE_STOP_SWIM(0x30C), // / TODO: investigate
    SMSG_SPLINE_MOVE_SET_RUN_MODE(0x30D), // / TODO: investigate
    SMSG_SPLINE_MOVE_SET_WALK_MODE(0x30E), // / TODO: investigate
    CMSG_GM_NUKE_ACCOUNT(0x30F), // GM client only
    MSG_GM_DESTROY_CORPSE(0x310), // GM client only
    CMSG_GM_DESTROY_ONLINE_CORPSE(0x311), // GM client only
    CMSG_ACTIVATETAXIEXPRESS(0x312), // implemented
    SMSG_SET_FACTION_ATWAR(0x313), // / TODO: implement
    SMSG_GAMETIMEBIAS_SET(0x314), // not used in client
    CMSG_DEBUG_ACTIONS_START(0x315), // GM client only
    CMSG_DEBUG_ACTIONS_STOP(0x316), // GM client only
    CMSG_SET_FACTION_INACTIVE(0x317), // implemented
    CMSG_SET_WATCHED_FACTION(0x318), // implemented
    MSG_MOVE_TIME_SKIPPED(0x319), // / TODO: implement
    SMSG_SPLINE_MOVE_ROOT(0x31A), // / TODO: investigate
    CMSG_SET_EXPLORATION_ALL(0x31B), // GM client only
    SMSG_INVALIDATE_PLAYER(0x31C), // / TODO: investigate
    CMSG_RESET_INSTANCES(0x31D), // implemented
    SMSG_INSTANCE_RESET(0x31E), // implemented
    SMSG_INSTANCE_RESET_FAILED(0x31F), // / TODO: implement
    SMSG_UPDATE_LAST_INSTANCE(0x320), // / TODO: implement
    MSG_RAID_TARGET_UPDATE(0x321), // implemented
    MSG_RAID_READY_CHECK(0x322), // implemented
    CMSG_LUA_USAGE(0x323), // not used in client
    SMSG_PET_ACTION_SOUND(0x324), // implemented
    SMSG_PET_DISMISS_SOUND(0x325), // implemented
    SMSG_GHOSTEE_GONE(0x326), // GM client only or not implemented
    CMSG_GM_UPDATE_TICKET_STATUS(0x327), // GM client only or not implemented
    SMSG_GM_TICKET_STATUS_UPDATE(0x328), // implemented
    MSG_SET_DUNGEON_DIFFICULTY(0x329), // implemented
    CMSG_GMSURVEY_SUBMIT(0x32A), // implemented
    SMSG_UPDATE_INSTANCE_OWNERSHIP(0x32B), // implemented
    CMSG_IGNORE_KNOCKBACK_CHEAT(0x32C), // GM client only
    SMSG_CHAT_PLAYER_AMBIGUOUS(0x32D), // not used in client
    MSG_DELAY_GHOST_TELEPORT(0x32E), // GM client only
    SMSG_SPELLINSTAKILLLOG(0x32F), // implemented
    SMSG_SPELL_UPDATE_CHAIN_TARGETS(0x330), // / TODO: implement
    CMSG_CHAT_FILTERED(0x331), // / TODO: implement
    SMSG_EXPECTED_SPAM_RECORDS(0x332), // / TODO: implement
    SMSG_SPELLSTEALLOG(0x333), // / implemented, same struct as SMSG_SPELLDISPELLOG
    CMSG_LOTTERY_QUERY_OBSOLETE(0x334), // not used in client
    SMSG_LOTTERY_QUERY_RESULT_OBSOLETE(0x335), // not used in client
    CMSG_BUY_LOTTERY_TICKET_OBSOLETE(0x336), // not used in client
    SMSG_LOTTERY_RESULT_OBSOLETE(0x337), // not used in client
    SMSG_CHARACTER_PROFILE(0x338), // not used in client
    SMSG_CHARACTER_PROFILE_REALM_CONNECTED(0x339), // not used in client
    SMSG_DEFENSE_MESSAGE(0x33A), // implemented
    SMSG_INSTANCE_DIFFICULTY(0x33B), // implemented
    MSG_GM_RESETINSTANCELIMIT(0x33C), // GM client only
    SMSG_MOTD(0x33D), // implemented
    SMSG_MOVE_SET_FLIGHT_OBSOLETE(0x33E), // not used in client
    SMSG_MOVE_UNSET_FLIGHT_OBSOLETE(0x33F), // not used in client
    CMSG_MOVE_FLIGHT_ACK_OBSOLETE(0x340), // not used in client
    MSG_MOVE_START_SWIM_CHEAT(0x341), // / TODO: investigate
    MSG_MOVE_STOP_SWIM_CHEAT(0x342), // / TODO: investigate
    SMSG_MOVE_SET_CAN_FLY(0x343), // implemented
    SMSG_MOVE_UNSET_CAN_FLY(0x344), // implemented
    CMSG_MOVE_SET_CAN_FLY_ACK(0x345), // implemented
    CMSG_MOVE_SET_FLY(0x346), // implemented
    CMSG_SOCKET_GEMS(0x347), // implemented
    CMSG_ARENA_TEAM_CREATE(0x348), // GM client only
    SMSG_ARENA_TEAM_COMMAND_RESULT(0x349), // / TODO: implement
    UMSG_UPDATE_ARENA_TEAM_OBSOLETE(0x34A), // not used in client
    CMSG_ARENA_TEAM_QUERY(0x34B), // GM client only
    SMSG_ARENA_TEAM_QUERY_RESPONSE(0x34C), // implemented
    CMSG_ARENA_TEAM_ROSTER(0x34D), // implemented
    SMSG_ARENA_TEAM_ROSTER(0x34E), // implemented
    CMSG_ARENA_TEAM_INVITE(0x34F), // implemented
    SMSG_ARENA_TEAM_INVITE(0x350), // implemented
    CMSG_ARENA_TEAM_ACCEPT(0x351), // implemented
    CMSG_ARENA_TEAM_DECLINE(0x352), // implemented
    CMSG_ARENA_TEAM_LEAVE(0x353), // implemented
    CMSG_ARENA_TEAM_REMOVE(0x354), // implemented
    CMSG_ARENA_TEAM_DISBAND(0x355), // implemented
    CMSG_ARENA_TEAM_LEADER(0x356), // implemented
    SMSG_ARENA_TEAM_EVENT(0x357), // / TODO: implement
    CMSG_BATTLEMASTER_JOIN_ARENA(0x358), // implemented
    MSG_MOVE_START_ASCEND(0x359), // implemented
    MSG_MOVE_STOP_ASCEND(0x35A), // implemented
    SMSG_ARENA_TEAM_STATS(0x35B), // implemented
    CMSG_LFG_SET_AUTOJOIN(0x35C), // implemented
    CMSG_LFG_CLEAR_AUTOJOIN(0x35D), // implemented
    CMSG_LFM_SET_AUTOFILL(0x35E), // implemented
    CMSG_LFM_CLEAR_AUTOFILL(0x35F), // implemented
    CMSG_ACCEPT_LFG_MATCH(0x360), // / TODO: implement
    CMSG_DECLINE_LFG_MATCH(0x361), // / TODO: implement
    CMSG_CANCEL_PENDING_LFG(0x362), // / TODO: implement
    CMSG_CLEAR_LOOKING_FOR_GROUP(0x363), // implemented
    CMSG_CLEAR_LOOKING_FOR_MORE(0x364), // / TODO: implement
    CMSG_SET_LOOKING_FOR_MORE(0x365), // implemented
    CMSG_SET_LFG_COMMENT(0x366), // implemented
    SMSG_LFG_TIMEDOUT(0x367), // / TODO: implement
    SMSG_LFG_OTHER_TIMEDOUT(0x368), // / TODO: implement
    SMSG_LFG_AUTOJOIN_FAILED(0x369), // implemented
    SMSG_LFG_AUTOJOIN_FAILED_NO_PLAYER(0x36A), // implemented
    SMSG_LFG_LEADER_IS_LFM(0x36B), // / TODO: implement
    SMSG_LFG_UPDATE(0x36C), // / TODO: implement
    SMSG_LFG_UPDATE_LFM(0x36D), // / TODO: implement
    SMSG_LFG_UPDATE_LFG(0x36E), // / TODO: implement
    SMSG_LFG_UPDATE_QUEUED(0x36F), // / TODO: implement
    SMSG_LFG_PENDING_INVITE(0x370), // / TODO: implement
    SMSG_LFG_PENDING_MATCH(0x371), // / TODO: implement
    SMSG_LFG_PENDING_MATCH_DONE(0x372), // / TODO: implement
    SMSG_TITLE_EARNED(0x373), // implemented
    CMSG_SET_TITLE(0x374), // implemented
    CMSG_CANCEL_MOUNT_AURA(0x375), // implemented
    SMSG_ARENA_ERROR(0x376), // implemented
    MSG_INSPECT_ARENA_TEAMS(0x377), // implemented
    SMSG_DEATH_RELEASE_LOC(0x378), // implemented
    CMSG_CANCEL_TEMP_ENCHANTMENT(0x379), // implemented
    SMSG_FORCED_DEATH_UPDATE(0x37A), // / TODO: implement
    CMSG_CHEAT_SET_HONOR_CURRENCY(0x37B), // GM client only
    CMSG_CHEAT_SET_ARENA_CURRENCY(0x37C), // GM client only
    MSG_MOVE_SET_FLIGHT_SPEED_CHEAT(0x37D), // GM client only
    MSG_MOVE_SET_FLIGHT_SPEED(0x37E), // / TODO: investigate
    MSG_MOVE_SET_FLIGHT_BACK_SPEED_CHEAT(0x37F), // GM client only
    MSG_MOVE_SET_FLIGHT_BACK_SPEED(0x380), // / TODO: investigate
    SMSG_FORCE_FLIGHT_SPEED_CHANGE(0x381), // implemented
    CMSG_FORCE_FLIGHT_SPEED_CHANGE_ACK(0x382), // "implemented"
    SMSG_FORCE_FLIGHT_BACK_SPEED_CHANGE(0x383), // / TODO: investigate
    CMSG_FORCE_FLIGHT_BACK_SPEED_CHANGE_ACK(0x384), // "implemented"
    SMSG_SPLINE_SET_FLIGHT_SPEED(0x385), // / TODO: investigate
    SMSG_SPLINE_SET_FLIGHT_BACK_SPEED(0x386), // / TODO: investigate
    CMSG_MAELSTROM_INVALIDATE_CACHE(0x387), // GM client only
    SMSG_FLIGHT_SPLINE_SYNC(0x388), // / TODO: investigate
    CMSG_SET_TAXI_BENCHMARK_MODE(0x389), // implemented
    SMSG_JOINED_BATTLEGROUND_QUEUE(0x38A), // not used in client
    SMSG_REALM_SPLIT(0x38B), // implemented
    CMSG_REALM_SPLIT(0x38C), // implemented
    CMSG_MOVE_CHNG_TRANSPORT(0x38D), // implemented
    MSG_PARTY_ASSIGNMENT(0x38E), // implemented
    SMSG_OFFER_PETITION_ERROR(0x38F), // / TODO: implement
    SMSG_TIME_SYNC_REQ(0x390), // implemented
    CMSG_TIME_SYNC_RESP(0x391), // / TODO: investigate, implement
    CMSG_SEND_LOCAL_EVENT(0x392), // GM client only
    CMSG_SEND_GENERAL_TRIGGER(0x393), // GM client only
    CMSG_SEND_COMBAT_TRIGGER(0x394), // GM client only
    CMSG_MAELSTROM_GM_SENT_MAIL(0x395), // GM client only
    SMSG_RESET_FAILED_NOTIFY(0x396), // / TODO: implement
    SMSG_REAL_GROUP_UPDATE(0x397), // / TODO: implement
    SMSG_LFG_DISABLED(0x398), // / TODO: implement
    CMSG_ACTIVE_PVP_CHEAT(0x399), // GM client only
    CMSG_CHEAT_DUMP_ITEMS_DEBUG_ONLY(0x39A), // used in debugging client only; PTR? seems to be
                                             // useful.
    SMSG_CHEAT_DUMP_ITEMS_DEBUG_ONLY_RESPONSE(0x39B), // used in debugging client only, same as
                                                      // SMSG_ITEM_QUERY_SINGLE_RESPONSE
    SMSG_CHEAT_DUMP_ITEMS_DEBUG_ONLY_RESPONSE_WRITE_FILE(0x39C), // used in debugging client only
    SMSG_UPDATE_COMBO_POINTS(0x39D), // implemented
    SMSG_VOICE_SESSION_ROSTER_UPDATE(0x39E), // / TODO: investigate, implement
    SMSG_VOICE_SESSION_LEAVE(0x39F), // / TODO: implement
    SMSG_VOICE_SESSION_ADJUST_PRIORITY(0x3A0), // not used in client
    CMSG_VOICE_SET_TALKER_MUTED_REQUEST(0x3A1), // not used in client
    SMSG_VOICE_SET_TALKER_MUTED(0x3A2), // / TODO: implement
    SMSG_INIT_EXTRA_AURA_INFO_OBSOLETE(0x3A3), // not used in client
    SMSG_SET_EXTRA_AURA_INFO_OBSOLETE(0x3A4), // not used in client
    SMSG_SET_EXTRA_AURA_INFO_NEED_UPDATE_OBSOLETE(0x3A5), // not used in client
    SMSG_CLEAR_EXTRA_AURA_INFO_OBSOLETE(0x3A6), // not used in client
    MSG_MOVE_START_DESCEND(0x3A7), // / TODO: investigate
    CMSG_IGNORE_REQUIREMENTS_CHEAT(0x3A8), // GM client only
    SMSG_IGNORE_REQUIREMENTS_CHEAT(0x3A9), // GM client only
    SMSG_SPELL_CHANCE_PROC_LOG(0x3AA), // not used in client
    CMSG_MOVE_SET_RUN_SPEED(0x3AB), // not used in client
    SMSG_DISMOUNT(0x3AC), // / TODO: implement
    MSG_MOVE_UPDATE_CAN_FLY(0x3AD), // / TODO: investigate
    MSG_RAID_READY_CHECK_CONFIRM(0x3AE), // implemented
    CMSG_VOICE_SESSION_ENABLE(0x3AF), // implemented
    SMSG_VOICE_SESSION_ENABLE(0x3B0), // not used in client
    SMSG_VOICE_PARENTAL_CONTROLS(0x3B1), // / TODO: implement
    CMSG_GM_WHISPER(0x3B2), // GM client only
    SMSG_GM_MESSAGECHAT(0x3B3), // / TODO: implement. like SMSG_MESSAGECHAT (0x096)
    MSG_GM_GEARRATING(0x3B4), // GM client only
    CMSG_COMMENTATOR_ENABLE(0x3B5), // / TODO: implement
    SMSG_COMMENTATOR_STATE_CHANGED(0x3B6), // / TODO: implement
    CMSG_COMMENTATOR_GET_MAP_INFO(0x3B7), // / TODO: implement
    SMSG_COMMENTATOR_MAP_INFO(0x3B8), // / TODO: investigate, implement
    CMSG_COMMENTATOR_GET_PLAYER_INFO(0x3B9), // / TODO: investigate
    SMSG_COMMENTATOR_GET_PLAYER_INFO(0x3BA), // not used in client
    SMSG_COMMENTATOR_PLAYER_INFO(0x3BB), // / TODO: investigate, implement
    CMSG_COMMENTATOR_ENTER_INSTANCE(0x3BC), // / TODO: investigate, implement
    CMSG_COMMENTATOR_EXIT_INSTANCE(0x3BD), // / TODO: implement
    CMSG_COMMENTATOR_INSTANCE_COMMAND(0x3BE), // / TODO: investigate, implement
    SMSG_CLEAR_TARGET(0x3BF), // implemented
    CMSG_BOT_DETECTED(0x3C0), // / TODO: investigate
    SMSG_CROSSED_INEBRIATION_THRESHOLD(0x3C1), // implemented
    CMSG_CHEAT_PLAYER_LOGIN(0x3C2), // GM client only
    CMSG_CHEAT_PLAYER_LOOKUP(0x3C3), // GM client only
    SMSG_CHEAT_PLAYER_LOOKUP(0x3C4), // GM client only
    SMSG_KICK_REASON(0x3C5), // / TODO: investigate
    MSG_RAID_READY_CHECK_FINISHED(0x3C6), // / TODO: implement
    CMSG_COMPLAIN(0x3C7), // implemented
    SMSG_COMPLAIN_RESULT(0x3C8), // implemented
    SMSG_FEATURE_SYSTEM_STATUS(0x3C9), // implemented
    CMSG_GM_SHOW_COMPLAINTS(0x3CA), // GM client only
    CMSG_GM_UNSQUELCH(0x3CB), // GM client only
    CMSG_CHANNEL_SILENCE_VOICE(0x3CC), // / TODO: implement
    CMSG_CHANNEL_SILENCE_ALL(0x3CD), // / TODO: implement
    CMSG_CHANNEL_UNSILENCE_VOICE(0x3CE), // / TODO: implement
    CMSG_CHANNEL_UNSILENCE_ALL(0x3CF), // / TODO: implement
    CMSG_TARGET_CAST(0x3D0), // GM client only
    CMSG_TARGET_SCRIPT_CAST(0x3D1), // GM client only
    CMSG_CHANNEL_DISPLAY_LIST(0x3D2), // implemented
    CMSG_SET_ACTIVE_VOICE_CHANNEL(0x3D3), // implemented
    CMSG_GET_CHANNEL_MEMBER_COUNT(0x3D4), // implemented
    SMSG_CHANNEL_MEMBER_COUNT(0x3D5), // implemented
    CMSG_CHANNEL_VOICE_ON(0x3D6), // / TODO: implement
    CMSG_CHANNEL_VOICE_OFF(0x3D7), // / TODO: implement
    CMSG_DEBUG_LIST_TARGETS(0x3D8), // not used in client
    SMSG_DEBUG_LIST_TARGETS(0x3D9), // not used in client
    SMSG_AVAILABLE_VOICE_CHANNEL(0x3DA), // / TODO: implement
    CMSG_ADD_VOICE_IGNORE(0x3DB), // / TODO: implement
    CMSG_DEL_VOICE_IGNORE(0x3DC), // / TODO: implement
    CMSG_PARTY_SILENCE(0x3DD), // / TODO: implement
    CMSG_PARTY_UNSILENCE(0x3DE), // / TODO: implement
    MSG_NOTIFY_PARTY_SQUELCH(0x3DF), // / TODO: implement
    SMSG_COMSAT_RECONNECT_TRY(0x3E0), // / TODO: implement
    SMSG_COMSAT_DISCONNECT(0x3E1), // / TODO: implement
    SMSG_COMSAT_CONNECT_FAIL(0x3E2), // / TODO: implement
    SMSG_VOICE_CHAT_STATUS(0x3E3), // / TODO: implement
    CMSG_REPORT_PVP_AFK(0x3E4), // / TODO: implement
    CMSG_REPORT_PVP_AFK_RESULT(0x3E5), // / TODO: implement
    CMSG_GUILD_BANKER_ACTIVATE(0x3E6), // implemented
    CMSG_GUILD_BANK_QUERY_TAB(0x3E7), // implemented
    SMSG_GUILD_BANK_LIST(0x3E8), // implemented
    CMSG_GUILD_BANK_SWAP_ITEMS(0x3E9), // implemented
    CMSG_GUILD_BANK_BUY_TAB(0x3EA), // implemented
    CMSG_GUILD_BANK_UPDATE_TAB(0x3EB), // implemented
    CMSG_GUILD_BANK_DEPOSIT_MONEY(0x3EC), // implemented
    CMSG_GUILD_BANK_WITHDRAW_MONEY(0x3ED), // implemented
    MSG_GUILD_BANK_LOG_QUERY(0x3EE), // implemented
    CMSG_SET_CHANNEL_WATCH(0x3EF), // / TODO: implement
    SMSG_USERLIST_ADD(0x3F0), // / TODO: implement
    SMSG_USERLIST_REMOVE(0x3F1), // / TODO: implement
    SMSG_USERLIST_UPDATE(0x3F2), // / TODO: implement
    CMSG_CLEAR_CHANNEL_WATCH(0x3F3), // / TODO: implement
    SMSG_INSPECT_TALENT(0x3F4), // implemented
    SMSG_GOGOGO_OBSOLETE(0x3F5), // not used in client
    SMSG_ECHO_PARTY_SQUELCH(0x3F6), // / TODO: implement
    CMSG_SET_TITLE_SUFFIX(0x3F7), // not used in client
    CMSG_SPELLCLICK(0x3F8), // implemented
    SMSG_LOOT_LIST(0x3F9), // / TODO: investigate
    CMSG_GM_CHARACTER_RESTORE(0x3FA), // GM client only
    CMSG_GM_CHARACTER_SAVE(0x3FB), // GM client only
    SMSG_VOICESESSION_FULL(0x3FC), // / TODO: implement
    MSG_GUILD_PERMISSIONS(0x3FD), // implemented
    MSG_GUILD_BANK_MONEY_WITHDRAWN(0x3FE), // implemented
    MSG_GUILD_EVENT_LOG_QUERY(0x3FF), // implemented
    CMSG_MAELSTROM_RENAME_GUILD(0x400), // GM client only
    CMSG_GET_MIRRORIMAGE_DATA(0x401), // / TODO: implement
    SMSG_MIRRORIMAGE_DATA(0x402), // / TODO: investigate, implement
    SMSG_FORCE_DISPLAY_UPDATE(0x403), // / TODO: implement
    SMSG_SPELL_CHANCE_RESIST_PUSHBACK(0x404), // not used in client
    CMSG_IGNORE_DIMINISHING_RETURNS_CHEAT(0x405), // GM client only
    SMSG_IGNORE_DIMINISHING_RETURNS_CHEAT(0x406), // GM client only
    CMSG_KEEP_ALIVE(0x407), // / TODO: implement
    SMSG_RAID_READY_CHECK_ERROR(0x408), // / TODO: implement
    CMSG_OPT_OUT_OF_LOOT(0x409), // implemented
    MSG_QUERY_GUILD_BANK_TEXT(0x40A), // implemented
    CMSG_SET_GUILD_BANK_TEXT(0x40B), // implemented
    CMSG_SET_GRANTABLE_LEVELS(0x40C), // not used in client
    CMSG_GRANT_LEVEL(0x40D), // / TODO: implement
    CMSG_REFER_A_FRIEND(0x40E), // not used in client
    MSG_GM_CHANGE_ARENA_RATING(0x40F), // GM client only
    CMSG_DECLINE_CHANNEL_INVITE(0x410), // / TODO: implement
    CMSG_GROUPACTION_THROTTLED(0x411), // / TODO: implement
    SMSG_OVERRIDE_LIGHT(0x412), // / TODO: investigate, implement
    SMSG_TOTEM_CREATED(0x413), // implemented
    CMSG_TOTEM_DESTROYED(0x414), // implemented
    CMSG_EXPIRE_RAID_INSTANCE(0x415), // not used in client
    CMSG_NO_SPELL_VARIANCE(0x416), // not used in client
    CMSG_QUESTGIVER_STATUS_MULTIPLE_QUERY(0x417), // implemented
    SMSG_QUESTGIVER_STATUS_MULTIPLE(0x418), // implemented
    CMSG_SET_PLAYER_DECLINED_NAMES(0x419), // / TODO: implement in russia
    SMSG_SET_PLAYER_DECLINED_NAMES_RESULT(0x41A), // / TODO: implement in russia
    CMSG_QUERY_SERVER_BUCK_DATA(0x41B), // GM client only
    CMSG_CLEAR_SERVER_BUCK_DATA(0x41C), // GM client only
    SMSG_SERVER_BUCK_DATA(0x41D), // GM client only
    SMSG_SEND_UNLEARN_SPELLS(0x41E), // implemented
    SMSG_PROPOSE_LEVEL_GRANT(0x41F), // / TODO: implement
    CMSG_ACCEPT_LEVEL_GRANT(0x420), // / TODO: implement
    SMSG_REFER_A_FRIEND_FAILURE(0x421), // / TODO: implement
    SMSG_SPLINE_MOVE_SET_FLYING(0x422), // / TODO: investigate
    SMSG_SPLINE_MOVE_UNSET_FLYING(0x423), // / TODO: investigate
    SMSG_SUMMON_CANCEL(0x424), // / TODO: implement
    CMSG_CHANGE_PERSONAL_ARENA_RATING(0x425), // GM client only
    CMSG_ALTER_APPEARANCE(0x426), // implemented
    SMSG_ENABLE_BARBER_SHOP(0x427), // implemented
    SMSG_BARBER_SHOP_RESULT(0x428), // implemented
    CMSG_CALENDAR_GET_CALENDAR(0x429), // / TODO: implement
    CMSG_CALENDAR_GET_EVENT(0x42A), // / TODO: investigate, implement
    CMSG_CALENDAR_GUILD_FILTER(0x42B), // / TODO: investigate, implement
    CMSG_CALENDAR_ARENA_TEAM(0x42C), // / TODO: investigate, implement
    CMSG_CALENDAR_ADD_EVENT(0x42D), // / TODO: investigate, implement
    CMSG_CALENDAR_UPDATE_EVENT(0x42E), // / TODO: investigate, implement
    CMSG_CALENDAR_REMOVE_EVENT(0x42F), // / TODO: investigate, implement
    CMSG_CALENDAR_COPY_EVENT(0x430), // / TODO: investigate, implement
    CMSG_CALENDAR_EVENT_INVITE(0x431), // / TODO: investigate, implement
    CMSG_CALENDAR_EVENT_RSVP(0x432), // / TODO: investigate, implement
    CMSG_CALENDAR_EVENT_REMOVE_INVITE(0x433), // / TODO: investigate, implement
    CMSG_CALENDAR_EVENT_STATUS(0x434), // / TODO: investigate, implement
    CMSG_CALENDAR_EVENT_MODERATOR_STATUS(0x435), // / TODO: investigate, implement
    SMSG_CALENDAR_SEND_CALENDAR(0x436), // / TODO: investigate, implement
    SMSG_CALENDAR_SEND_EVENT(0x437), // / TODO: investigate, implement
    SMSG_CALENDAR_FILTER_GUILD(0x438), // / TODO: implement
    SMSG_CALENDAR_ARENA_TEAM(0x439), // / TODO: implement
    SMSG_CALENDAR_EVENT_INVITE(0x43A), // / TODO: investigate, implement
    SMSG_CALENDAR_EVENT_INVITE_REMOVED(0x43B), // / TODO: investigate, implement
    SMSG_CALENDAR_EVENT_STATUS(0x43C), // / TODO: investigate, implement
    SMSG_CALENDAR_COMMAND_RESULT(0x43D), // / TODO: implement
    SMSG_CALENDAR_RAID_LOCKOUT_ADDED(0x43E), // / TODO: investigate, implement
    SMSG_CALENDAR_RAID_LOCKOUT_REMOVED(0x43F), // / TODO: investigate, implement
    SMSG_CALENDAR_EVENT_INVITE_ALERT(0x440), // / TODO: investigate, implement
    SMSG_CALENDAR_EVENT_INVITE_REMOVED_ALERT(0x441), // / TODO: investigate, implement
    SMSG_CALENDAR_EVENT_INVITE_STATUS_ALERT(0x442), // / TODO: investigate, implement
    SMSG_CALENDAR_EVENT_REMOVED_ALERT(0x443), // / TODO: investigate, implement
    SMSG_CALENDAR_EVENT_UPDATED_ALERT(0x444), // / TODO: investigate, implement
    SMSG_CALENDAR_EVENT_MODERATOR_STATUS_ALERT(0x445), // / TODO: investigate, implement
    CMSG_CALENDAR_COMPLAIN(0x446), // / TODO: investigate, implement
    CMSG_CALENDAR_GET_NUM_PENDING(0x447), // / TODO: implement
    SMSG_CALENDAR_SEND_NUM_PENDING(0x448), // / TODO: implement
    CMSG_SAVE_DANCE(0x449), // development client only
    SMSG_NOTIFY_DANCE(0x44A), // / TODO: investigate, well .. its in dev anyway..
    CMSG_PLAY_DANCE(0x44B), // / TODO: investigate, well .. its in dev anyway..
    SMSG_PLAY_DANCE(0x44C), // / TODO: investigate, well .. its in dev anyway..
    CMSG_LOAD_DANCES(0x44D), // development client only
    CMSG_STOP_DANCE(0x44E), // / TODO: implement, well .. its in dev anyway..
    SMSG_STOP_DANCE(0x44F), // / TODO: implement, well .. its in dev anyway..
    CMSG_SYNC_DANCE(0x450), // / TODO: implement, well .. its in dev anyway..
    CMSG_DANCE_QUERY(0x451), // development client only
    SMSG_DANCE_QUERY_RESPONSE(0x452), // / TODO: investigate, well .. its in dev anyway..
    SMSG_INVALIDATE_DANCE(0x453), // / TODO: implement, well .. its in dev anyway..
    CMSG_DELETE_DANCE(0x454), // development client only
    SMSG_LEARNED_DANCE_MOVES(0x455), // / TODO: investigate, well .. its in dev anyway..
    CMSG_LEARN_DANCE_MOVE(0x456), // development client only
    CMSG_UNLEARN_DANCE_MOVE(0x457), // development client only
    CMSG_SET_RUNE_COUNT(0x458), // not used in client
    CMSG_SET_RUNE_COOLDOWN(0x459), // not used in client
    MSG_MOVE_SET_PITCH_RATE_CHEAT(0x45A), // not used in client
    MSG_MOVE_SET_PITCH_RATE(0x45B), // / TODO: investigate
    SMSG_FORCE_PITCH_RATE_CHANGE(0x45C), // / TODO: investigate
    CMSG_FORCE_PITCH_RATE_CHANGE_ACK(0x45D), // not used in client
    SMSG_SPLINE_SET_PITCH_RATE(0x45E), // / TODO: investigate
    SMSG_MOVE_ABANDON_TRANSPORT(0x45F), // not used in client
    MSG_MOVE_ABANDON_TRANSPORT(0x460), // not used in client
    CMSG_MOVE_ABANDON_TRANSPORT_ACK(0x461), // not used in client
    CMSG_UPDATE_MISSILE_TRAJECTORY(0x462), // / TODO: investigate
    SMSG_UPDATE_ACCOUNT_DATA_COMPLETE(0x463), // handled but unused..
    SMSG_TRIGGER_MOVIE(0x464), // implemented
    CMSG_COMPLETE_MOVIE(0x465), // / TODO: implement
    CMSG_SET_GLYPH_SLOT(0x466), // not used in client
    CMSG_SET_GLYPH(0x467), // not used in client
    SMSG_ACHIEVEMENT_EARNED(0x468), // implemented
    SMSG_DYNAMIC_DROP_ROLL_RESULT(0x469), // not used in client
    SMSG_CRITERIA_UPDATE(0x46A), // implemented
    CMSG_QUERY_INSPECT_ACHIEVEMENTS(0x46B), // implemented
    SMSG_RESPOND_INSPECT_ACHIEVEMENTS(0x46C), // implemented
    CMSG_DISMISS_CONTROLLED_VEHICLE(0x46D), // / TODO: implement
    CMSG_COMPLETE_ACHIEVEMENT_CHEAT(0x46E), // GM client only
    SMSG_QUESTUPDATE_ADD_PVP_KILL(0x46F), // / TODO: implement
    CMSG_SET_CRITERIA_CHEAT(0x470), // GM client only
    SMSG_GROUP_SWAP_FAILED(0x471), // / TODO: implement
    CMSG_UNITANIMTIER_CHEAT(0x472), // GM client only
    CMSG_CHAR_CUSTOMIZE(0x473), // / TODO: implement
    SMSG_CHAR_CUSTOMIZE(0x474), // / TODO: implement
    SMSG_PET_RENAMEABLE(0x475), // / TODO: implement
    CMSG_REQUEST_VEHICLE_EXIT(0x476), // / TODO: implement
    CMSG_REQUEST_VEHICLE_PREV_SEAT(0x477), // / TODO: implement
    CMSG_REQUEST_VEHICLE_NEXT_SEAT(0x478), // / TODO: implement
    CMSG_REQUEST_VEHICLE_SWITCH_SEAT(0x479), // not used in client
    CMSG_PET_LEARN_TALENT(0x47A), // implemented
    CMSG_PET_UNLEARN_TALENTS(0x47B), // GM client only
    SMSG_SET_PHASE_SHIFT(0x47C), // implemented
    SMSG_ALL_ACHIEVEMENT_DATA(0x47D), // implemented
    CMSG_FORCE_SAY_CHEAT(0x47E), // GM client only
    SMSG_HEALTH_UPDATE(0x47F), // / TODO: implement..
    SMSG_POWER_UPDATE(0x480), // implemented
    CMSG_GAMEOBJ_REPORT_USE(0x481), // implemented
    SMSG_HIGHEST_THREAT_UPDATE(0x482), // / TODO: implement
    SMSG_THREAT_UPDATE(0x483), // / TODO: implement
    SMSG_THREAT_REMOVE(0x484), // / TODO: implement
    SMSG_THREAT_CLEAR(0x485), // / TODO: implement
    SMSG_CONVERT_RUNE(0x486), // implemented
    SMSG_RESYNC_RUNES(0x487), // / TODO: investigate, implement
    SMSG_ADD_RUNE_POWER(0x488), // / TODO: investigate, implement
    CMSG_START_QUEST(0x489), // not used in client, GM remote start?
    CMSG_REMOVE_GLYPH(0x48A), // implemented
    CMSG_DUMP_OBJECTS(0x48B), // not used in client
    SMSG_DUMP_OBJECTS_DATA(0x48C), // not used in client
    CMSG_DISMISS_CRITTER(0x48D), // / TODO: implement
    SMSG_NOTIFY_DEST_LOC_SPELL_CAST(0x48E), // / TODO: investigate, implement
    CMSG_AUCTION_LIST_PENDING_SALES(0x48F), // implemented
    SMSG_AUCTION_LIST_PENDING_SALES(0x490), // / TODO: investigate, implement
    SMSG_MODIFY_COOLDOWN(0x491), // / TODO: implement
    SMSG_PET_UPDATE_COMBO_POINTS(0x492), // / TODO: implement
    CMSG_ENABLETAXI(0x493), // implemented
    SMSG_PRE_RESURRECT(0x494), // implemented
    SMSG_AURA_UPDATE_ALL(0x495), // / TODO: implement
    SMSG_AURA_UPDATE(0x496), // implemented
    CMSG_FLOOD_GRACE_CHEAT(0x497), // GM client only
    SMSG_SERVER_FIRST_ACHIEVEMENT(0x498), // implemented
    SMSG_PET_LEARNED_SPELL(0x499), // implemented
    SMSG_PET_UNLEARNED_SPELL(0x49A), // implemented
    CMSG_CHANGE_SEATS_ON_CONTROLLED_VEHICLE(0x49B), // not used in client
    CMSG_HEARTH_AND_RESURRECT(0x49C), // / TODO: implement
    SMSG_CONTROL_VEHICLE(0x49D), // / TODO: implement correctly...
    SMSG_CRITERIA_DELETED(0x49E), // implemented
    SMSG_ACHIEVEMENT_DELETED(0x49F), // implemented
    CMSG_SERVER_INFO_QUERY(0x4A0), // not used in client
    SMSG_SERVER_INFO_RESPONSE(0x4A1), // not used in client
    CMSG_CHECK_LOGIN_CRITERIA(0x4A2), // not used in client
    SMSG_SERVER_BUCK_DATA_START(0x4A3), // not used in client
    CMSG_QUERY_VEHICLE_STATUS(0x4A4), // not used in client
    UMSG_UNKNOWN_1189(0x4A5), // / TODO: investigate, old SMSG_PET_GUIDS
    SMSG_UNKNOWN_1190(0x4A6), // / TODO: investigate, old SMSG_CLIENTCACHE_VERSION
    SMSG_PLAYER_VEHICLE_DATA(0x4A7), // / TODO: investigate, smsg guid+uint32 (vehicle)
    CMSG_PLAYER_VEHICLE_ENTER(0x4A8), // / TODO: investigate, cmsg uint64
    CMSG_EJECT_PASSENGER(0x4A9), // / TODO: investigate, cmsg uint64
    SMSG_PET_GUIDS(0x4AA), // / TODO: implement
    SMSG_CLIENTCACHE_VERSION(0x4AB), // / TODO: implement
    UMSG_UNKNOWN_1196(0x4AC), // / TODO: investigate
    UMSG_UNKNOWN_1197(0x4AD), // / TODO: investigate
    UMSG_UNKNOWN_1198(0x4AE), // / TODO: investigate
    UMSG_UNKNOWN_1199(0x4AF), // / TODO: investigate
    UMSG_UNKNOWN_1200(0x4B0), // / TODO: investigate
    UMSG_UNKNOWN_1201(0x4B1), // / TODO: investigate
    SMSG_ITEMREFUNDINFO(0x4B2), // implemented
    CMSG_ITEMREFUNDINFO(0x4B3), // implemented
    CMSG_ITEMREFUNDREQUEST(0x4B4), // implemented
    SMSG_ITEMREFUNDREQUEST(0x4B5), // implemented
    CMSG_UNKNOWN_1206(0x4B6), // / TODO: investigate, CMSG, uint32
    SMSG_UNKNOWN_1207(0x4B7), // / TODO: investigate, SMSG, string+float
    CMSG_LFG_SET_ROLES(0x4B8), // / TODO: investigate, CMSG, empty, lua: SetLFGRoles
    UMSG_UNKNOWN_1209(0x4B9), // / TODO: investigate
    CMSG_UNKNOWN_1210(0x4BA), // / TODO: investigate, CMSG, uint64, lua: CalendarContextEventSignUp
    SMSG_UNKNOWN_1211(0x4BB), // / TODO: investigate, SMSG, calendar related
    SMSG_EQUIPMENT_SET_LIST(0x4BC), // / TODO: investigate, SMSG, equipment manager list?
    CMSG_EQUIPMENT_SET_SAVE(0x4BD), // / TODO: investigate, CMSG, lua: SaveEquipmentSet
    CMSG_UNKNOWN_1214(0x4BE), // / TODO: investigate, CMSG, missle?
    SMSG_UNKNOWN_1215(0x4BF), // TODO: investigate,/ SMSG, uint64, uint8, 3 x float
    SMSG_TALENTS_INFO(0x4C0), // / TODO: investigate, SMSG, talents related
    CMSG_LEARN_TALENTS_MULTIPLE(0x4C1), // / TODO: investigate, CMSG, lua: LearnPreviewTalents (for
                                        // player?)
    CMSG_LEARN_PREVIEW_TALENTS_PET(0x4C2), // / TODO: investigate, CMSG, lua: LearnPreviewTalents
                                           // (for pet?)
    UMSG_UNKNOWN_1219(0x4C3), // / TODO: investigate
    UMSG_UNKNOWN_1220(0x4C4), // / TODO: investigate
    UMSG_UNKNOWN_1221(0x4C5), // / TODO: investigate
    UMSG_UNKNOWN_1222(0x4C6), // / TODO: investigate
    SMSG_UNKNOWN_1223(0x4C7), // / TODO: investigate, uint64, arena pet?
    SMSG_UNKNOWN_1224(0x4C8), // / TODO: investigate, uint32 "Can't change arena team..."
    UMSG_UNKNOWN_1225(0x4C9), // / TODO: investigate
    UMSG_UNKNOWN_1226(0x4CA), // / TODO: investigate
    CMSG_UNKNOWN_1227(0x4CB), //
    SMSG_UNKNOWN_1228(0x4CC), //
    CMSG_EQUIPMENT_SET_USE(0x4D5), // implemented
    SMSG_EQUIPMENT_SET_USE_RESULT(0x4D6), // implemented
    MSG_SET_RAID_DIFFICULTY(0x4EB), // implemented
    CMSG_WORLD_STATE_UI_TIMER_UPDATE(0x4F6), // implemented
    SMSG_WORLD_STATE_UI_TIMER_UPDATE(0x4F7), // implemented
    NUM_MSG_TYPES(0x4F8); // max msg number
    
    private int opcode;
    
    OpcodeTable(final int opcode) {
    
        this.opcode = opcode;
    }
    
    public static OpcodeTable getOpcode(final int ord) {
    
        for (final OpcodeTable ot : OpcodeTable.values()) {
            if (ot.opcode == ord) {
                return ot;
            }
        }
        return null;
    }
    
    public int value() {
    
        return this.opcode;
    }
}
