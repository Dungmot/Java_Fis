package com.fis.finaltest.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TrackEntry")
@Data
public class TrackEntry {
	
	@JoinColumn(name = "date")
	private LocalDateTime date;
	
	@ManyToOne
    @JoinColumn(name = "evidence")
    private Evidence evidence;
	
	@ManyToOne
    @JoinColumn(name = "detective")
    private Detective detective;
	
	enum TrackAction{
        SUBMITTED, RETRIEVED, RETURNED
    }
	@Enumerated
    private TrackAction action;

	@JoinColumn(name = "reason")
    private String reason;
}
