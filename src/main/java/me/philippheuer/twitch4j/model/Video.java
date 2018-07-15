package me.philippheuer.twitch4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.Map;
import lombok.Data;

/**
 * Model representing a video.
 *
 * @author Philipp Heuer [https://github.com/PhilippHeuer]
 * @version %I%, %G%
 * @since 1.0
 */
@Data
public class Video {

	@JsonProperty("_id")
	private long id;

	private String title;

	private String description;

	private String description_html;

	private long broadcastId;

	private String broadcastType; // highlight|archive|upload

	private Channel channel;

	private String status;

	private String tagList; // Possibly used for exporting to YouTube. No real use.

	private String game;

	private int length;

	private Map<String, String> preview;

	private String url;

	private int views;

	private VideoFramerates fps;

	private VideoResolutions resolutions;

	private Date createdAt;

	private Date publishedAt;
}